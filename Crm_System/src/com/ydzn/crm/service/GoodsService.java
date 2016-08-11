package com.ydzn.crm.service;

import com.ydzn.crm.po.Goods;

import java.util.List;

/**
 * Created by HeathHose on 2016/8/2.
 */
public interface GoodsService {

    //获取所有商品信息
    public List<Goods> getGoodsInf() throws Exception;

    //按名称获取商品信息
    public Goods getGoodsInfByName(String goodsName) throws Exception;

    //更新商品
    public boolean upadateGoodsInf(int goodsID,Goods good) throws Exception;

    //添加商品
    public boolean insertGoods(Goods goods)throws Exception;

    //删除商品
    public boolean deleteGoods(int goodsID) throws Exception;
}
