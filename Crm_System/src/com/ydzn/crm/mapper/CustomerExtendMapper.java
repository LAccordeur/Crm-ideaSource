package com.ydzn.crm.mapper;

import com.ydzn.crm.po.Activity;
import com.ydzn.crm.po.Customer;

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

}
