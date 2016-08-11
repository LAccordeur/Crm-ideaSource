package com.ydzn.crm.service;

import com.ydzn.crm.po.Activity;

import java.util.List;

/**
 * Created by HeathHose on 2016/8/2.
 */
public interface CustomerService {
    //验证顾客用户名与密码(返回用户ID)
    public int validateCustomer(String username,String pwd);

    //注册顾客用户名与密码
    //public registerCustomer (String username,String pwd)

    //修改顾客用户名与密码
    // changeCustomer (String username,String pwd)

    //查看已发布活动详情
    public List<Activity> seeAcitvityInf() throws Exception;

}
