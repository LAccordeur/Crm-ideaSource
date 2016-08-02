package com.ydzn.crm.service;

import com.ydzn.crm.po.Shopowner;

/**
 * Created by HeathHose on 2016/7/29.
 */
public interface ShopownerService {
    //验证商家登录;成功登陆返回商家ID，反之返回0
    public int shopownerValidate(String username,String password) throws  Exception;

    //注册商家
    public int registerShopowner() throws Exception;

    //获取商家信息，返回pojo
    public Shopowner getShopownerInf(int userId) throws Exception;
}
