package com.ydzn.crm.service.impl;

import com.ydzn.crm.mapper.ShopownerMapper;
import com.ydzn.crm.po.Shopowner;
import com.ydzn.crm.service.ShopownerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Time;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by HeathHose on 2016/8/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:**/applicationContext-*.xml","classpath*:**/springmvc.xml"})
public class ShopownerServiceImlTest extends AbstractJUnit4SpringContextTests {


    @Autowired
    public ShopownerService shopownerServiceIml;


    @Test
    public void shopownerValidate() throws Exception {
        int userId;
        userId = shopownerServiceIml.shopownerValidate("HeathHose","123");
        System.out.println(userId);
    }

    @Test
    public void updateShopownerInf() throws Exception {
        //Shopowner owner = new Shopowner();
        //owner.setAccountid(6);
        //owner.setAccountname("supermary");
        //owner.setAccountaddress("成都");
        //owner.setOpeningtime(new Time());
        //owner.setClosingtime(new Time());

        //System.out.println(shopownerServiceIml.updateShopownerInf(6,owner));
    }

}