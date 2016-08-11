package com.ydzn.crm.service.impl;

import com.ydzn.crm.mapper.GoodsExtendMapper;
import com.ydzn.crm.mapper.GoodsMapper;
import com.ydzn.crm.po.Goods;
import com.ydzn.crm.po.GoodsExample;
import com.ydzn.crm.po.ShopownerExample;
import com.ydzn.crm.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by HeathHose on 2016/8/2.
 */
public class GoodsServiceIml implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private GoodsExtendMapper goodsExtendMapper;

    //获取所有商品信息
    @Override
    public List<Goods> getGoodsInf() throws Exception {

        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        criteria.andGoodsidIsNotNull();

        List<Goods> list = goodsMapper.selectByExampleWithBLOBs(goodsExample);

        return list;
    }


    //搁置
    @Override
    public Goods getGoodsInfByName(String goodsName) throws Exception {
        //按名称获取商品信息

        return null;
    }

    //更新商品
    @Override
    public boolean upadateGoodsInf(int goodsID,Goods good) throws Exception {

        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        criteria.andGoodsidEqualTo(goodsID);

        int id  = goodsMapper.updateByExampleWithBLOBs(good,goodsExample);
        if(id > 0)
            return  true;
        return false;
    }

    //插入商品
    @Override
    public boolean insertGoods(Goods goods) throws Exception {

        if(goodsExtendMapper.insertGoods(goods)>0)
            return true;
        return false;
    }

    @Override
    public boolean deleteGoods(int goodsID) throws Exception {
        if(goodsMapper.deleteByPrimaryKey(goodsID) > 0){
            return true;
        }
        return false;
    }
}
