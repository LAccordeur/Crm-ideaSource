package com.ydzn.crm.mapper;

import com.ydzn.crm.po.Purchasehistory;

/**
 * Created by HeathHose on 2016/8/8.
 */
public interface PurchasehistoryExtendMapper {
    //插入消费记录
    int insert(Purchasehistory purchasehistory);

    //获取最后一次自增ID
    int selectLastAutoCrement();

    //获取日销售额（默认当前时间日期）
    public int getDailySales();

    //获取月销售额
    public int getMonthlySales();

    //	获取年销售额
    public int getYearlySales();
}
