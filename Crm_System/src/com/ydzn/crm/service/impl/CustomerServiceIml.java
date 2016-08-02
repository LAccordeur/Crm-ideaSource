package com.ydzn.crm.service.impl;

import com.ydzn.crm.po.Customer;
import com.ydzn.crm.po.CustomerExample;
import com.ydzn.crm.service.CustomerService;

import java.util.List;

/**
 * Created by HeathHose on 2016/7/29.
 */
public class CustomerServiceIml implements CustomerService{

    //验证顾客用户名和密码
    @Override
    public boolean customerValidate(String username, String password) throws Exception {

        CustomerExample customerExample = new CustomerExample();
        CustomerExample.Criteria criteria = customerExample.createCriteria();
        //criteria.andUsernameEqualTo(username);
//        criteria.and
//
//        List<Customer> list = customerExample.selectByExample(customerExample);
        return false;
    }
}
