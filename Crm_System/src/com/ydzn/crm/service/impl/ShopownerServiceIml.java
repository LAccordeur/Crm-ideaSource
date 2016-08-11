package com.ydzn.crm.service.impl;

import com.ydzn.crm.mapper.PurchasehistoryExtendMapper;
import com.ydzn.crm.mapper.ShopownerMapper;
import com.ydzn.crm.po.Goods;
import com.ydzn.crm.po.Purchasehistory;
import com.ydzn.crm.po.Shopowner;
import com.ydzn.crm.po.ShopownerExample;
import com.ydzn.crm.service.ShopownerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by HeathHose on 2016/7/29.
 */
@Service
public class ShopownerServiceIml implements ShopownerService {

    @Autowired
    private ShopownerMapper shopownerMapper;
    @Autowired
    private PurchasehistoryExtendMapper purchasehistoryExtendMapper;


    //验证商家登录的用户名和密码
    @Override
    public int shopownerValidate(String accountName, String password) throws Exception {

        ShopownerExample shopownerExample = new ShopownerExample();
        ShopownerExample.Criteria criteria = shopownerExample.createCriteria();
        criteria.andAccountnameEqualTo(accountName);
        criteria.andAccountpwdEqualTo(password);


        List<Shopowner> list = shopownerMapper.selectByExample(shopownerExample);
        for (Shopowner owner :list) {
            return owner.getAccountid();
        }
        return 0;
    }

    //搁置
    @Override
    public int registerShopowner() throws Exception {

        return 0;
    }

    //获取商家信息
    @Override
    public Shopowner getShopownerInf(int userId) throws Exception {
        Shopowner owner;

        owner = shopownerMapper.selectByPrimaryKey(userId);
        return owner;
    }

    //更新商家信息
    @Override
    public boolean updateShopownerInf(int userId, Shopowner owner) throws Exception {

        owner.setAccountid(userId);
        int id = shopownerMapper.updateByPrimaryKeyWithBLOBs(owner);
        if(id > 0) return true;
        return false;
    }



    //获取日销售额（默认当前时间日期）
    @Override
    public int getDailySales(){
         int sale = 0;
         try{
             sale = purchasehistoryExtendMapper.getDailySales();
         }catch (Exception e){
             return sale;
         }
         return sale;
    }

    //获取月销售额
    @Override
    public int getMonthlySales() throws Exception {
        int sale = 0;
        try{
            sale = purchasehistoryExtendMapper.getMonthlySales();
        }catch (Exception e){
            return sale;
        }
        return sale;

    }

    //获取年销售额
    @Override
    public int getYearlySales() throws Exception {
        int sale = 0;
        try{
            sale = purchasehistoryExtendMapper.getYearlySales();
        }catch (Exception e){
            return sale;
        }
        return sale;

    }


}
