package com.ydzn.crm.service.impl;

import com.ydzn.crm.mapper.*;
import com.ydzn.crm.po.*;
import com.ydzn.crm.service.BonusPointService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.sun.org.apache.xerces.internal.impl.xpath.regex.CaseInsensitiveMap.get;

/**
 * Created by HeathHose on 2016/8/3.
 */
public class BonusPointServiceImpl implements BonusPointService {

    @Autowired
    private CustomerMapper customerMapper;
    @Autowired
    private  CustomerExtendMapper customerExtendMapper;

    //消费明细Mapper
    @Autowired
    private PurchasedetailExtendMapper purchasedetailExtendMapper;

    //消费记录Mapper
    @Autowired
    private PurchasehistoryExtendMapper purchasehistoryExtendMapper;

    //录入积分 添加消费记录
    @Override
    public boolean logCreditAndHistory(int telephoneNumber, int bonusPoint, Map<Integer,Integer> goodsMap) throws Exception {
        //设置观察变量
        int type = 0;
        //设置本次消费记录ID
        int recordID = -1;

        //获取本用户的积分/ID
        CustomerExample customerExample = new CustomerExample();
        CustomerExample.Criteria criteria = customerExample.createCriteria();
        criteria.andTelephonenumberEqualTo(Integer.toString(telephoneNumber));
        List<Customer> list = customerMapper.selectByExample(customerExample);
        int point = list.get(0).getBonuspoint();
        int customerID = list.get(0).getCustomid();
        point += bonusPoint;

        //更新积分
        HashMap<String,Integer> bonusMap = new HashMap<String, Integer>();
        bonusMap.put("telephoneNumber",telephoneNumber);
        bonusMap.put("bonusPoint",point);
        if(customerExtendMapper.updateCustomerBonusPoint(bonusMap)>0)
            type++;

        //新增消费记录 获取新增消费记录ID
        Purchasehistory purchasehistory = new Purchasehistory();
        purchasehistory.setCustomid(customerID);
        purchasehistory.setRecordmoney((float)bonusPoint);
        purchasehistory.setRecordtime(new Date());
        if(purchasehistoryExtendMapper.insert(purchasehistory) > 0){
            recordID = purchasehistoryExtendMapper.selectLastAutoCrement();
            //判断是否生成消费记录
            if(recordID < 0) return false;
            type++;
        }


        //新增消费明细
        for (Map.Entry<Integer,Integer> entry : goodsMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            Purchasedetail purchasedetail = new Purchasedetail();
            purchasedetail.setRecordid(recordID);
            purchasedetail.setGoodsid(key);
            purchasedetail.setGoodsnum(value);
            purchasedetailExtendMapper.insert(purchasedetail);
        }
        if(type == 2)
            return  true;
        return false;
    }

    // 查看会员列表（显示会员积分榜）
    @Override
    public List<Customer> getCustomersCreditByOrder() throws Exception{

        List<Customer> list = customerExtendMapper.getCustomersCreditByOrder();
        return list;
    }
}
