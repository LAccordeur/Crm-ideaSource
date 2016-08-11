package com.ydzn.crm.service.impl;

import com.ydzn.crm.mapper.CustomerExtendMapper;
import com.ydzn.crm.po.Activity;
import com.ydzn.crm.po.CustomerExample;
import com.ydzn.crm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by HeathHose on 2016/7/29.
 */
public class CustomerServiceIml implements CustomerService {

    @Autowired
    private CustomerExtendMapper customerExtendMapper;

    //验证顾客用户名和密码
    public boolean customerValidate(String username, String password) throws Exception {

        CustomerExample customerExample = new CustomerExample();
        CustomerExample.Criteria criteria = customerExample.createCriteria();
        //criteria.andUsernameEqualTo(username);
//        criteria.and
//
//        List<Customer> list = customerExample.selectByExample(customerExample);
        return false;
    }

    @Override
    public int validateCustomer(String username, String pwd) {
        return 0;
    }

    @Override
    public List<Activity> seeAcitvityInf()throws Exception{
        List<Activity> list = customerExtendMapper.seeAcitvityInf();
        return list;
    }
}
