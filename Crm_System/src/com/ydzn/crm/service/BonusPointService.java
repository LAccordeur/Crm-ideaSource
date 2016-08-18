package com.ydzn.crm.service;

import com.ydzn.crm.po.Customer;
import com.ydzn.crm.po.Goods;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by HeathHose on 2016/8/2.
 */
public interface BonusPointService {
    //录入积分
    public boolean logCreditAndHistory(int telephoneNumber, int bonusPoint, Map<String,Integer> goodsMap) throws  Exception;

    // 查看会员列表（显示会员积分榜）
    public List<Customer> getCustomersCreditByOrder() throws Exception;


}
