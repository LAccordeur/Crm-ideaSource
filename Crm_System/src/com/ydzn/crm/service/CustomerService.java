package com.ydzn.crm.service;

/**
 * Created by HeathHose on 2016/7/29.
 */
public interface CustomerService {

    //验证登录
    public boolean customerValidate(String username,String password) throws  Exception;
}
