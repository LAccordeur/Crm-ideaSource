package com.ydzn.crm.service;

import com.ydzn.crm.po.Goods;
import com.ydzn.crm.po.Shopowner;

import java.util.List;

/**
 * Created by HeathHose on 2016/7/29.
 */
public interface ShopownerService {
    //验证商家登录;成功登陆返回商家ID，反之返回0
    public int shopownerValidate(String username,String password) throws  Exception;

    //注册商家*
    public int registerShopowner() throws Exception;

    //获取商家信息，返回pojo
    public Shopowner getShopownerInf(int userId) throws Exception;

    //更新商家信息
    public boolean updateShopownerInf(int userId,Shopowner owner) throws Exception;




    //获取日销售额（默认当前时间日期）
    public int getDailySales() throws Exception;

    //获取月销售额
    public int getMonthlySales() throws Exception;

    //	获取年销售额
    public int getYearlySales() throws Exception;

}
