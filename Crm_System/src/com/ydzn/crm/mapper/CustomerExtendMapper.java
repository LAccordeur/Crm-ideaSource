package com.ydzn.crm.mapper;

import com.ydzn.crm.po.Activity;
import com.ydzn.crm.po.Customer;
import com.ydzn.crm.po.Purchasehistory;

import java.util.HashMap;
import java.util.List;

/**
 * Created by HeathHose on 2016/8/3.
 */
public interface CustomerExtendMapper {

    //更新顾客积分
    int updateCustomerBonusPoint(HashMap<String,Integer> map) throws  Exception;

    // 查看会员列表（显示会员积分榜）
    List<Customer> getCustomersCreditByOrder() throws Exception;

    //查看已发布活动详情
    List<Activity> seeAcitvityInf() throws Exception;

    //查看指定会员的消费明细
    List<Purchasehistory> getCustomerDetail(int CustomerID) throws Exception;

    //查看指定会员消费总额
    int getCustomerExpenditure(int customerID) throws Exception;
}
