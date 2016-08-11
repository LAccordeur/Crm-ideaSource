package com.ydzn.crm.service.impl;

import com.ydzn.crm.mapper.GoodsMapper;
import com.ydzn.crm.po.Goods;
import com.ydzn.crm.service.GoodsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.AfterTransaction;

import static org.junit.Assert.*;

/**
 * Created by HeathHose on 2016/8/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:**/applicationContext-*.xml","classpath*:**/springmvc.xml"})
public class GoodsServiceImlTest {

    @Autowired
    private GoodsService goodsService;
    @Autowired
    private GoodsMapper goodsMapper;


    @Test
    public void upadateGoodsInf() throws Exception {
        Goods good =new Goods();
        good.setGoodsid(1);
        good.setGoodsname("厚被子");
        good.setGoodsmoney(2.2f);
        good.setGoodsstorage(22);

        System.out.println(goodsService.upadateGoodsInf(1,good));

    }

    @Test
    public void insertGoods() throws Exception{
        Goods good =new Goods();
        good.setGoodsname("厚被子");
        good.setGoodsmoney(2.2f);
        good.setGoodsstorage(22);

        System.out.println(goodsMapper.insert(good));
    }

}