package com.ydzn.crm.service.impl;

import com.ydzn.crm.mapper.ShopownerMapper;
import com.ydzn.crm.po.Shopowner;
import com.ydzn.crm.po.ShopownerExample;
import com.ydzn.crm.service.ShopownerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by HeathHose on 2016/7/29.
 */
@Service
public class ShopownerServiceIml implements ShopownerService {

    @Autowired
    private ShopownerMapper shopownerMapper;
    //验证商家登录的用户名和密码
    @Override
    public int shopownerValidate(String accountName, String password) throws Exception {

        ShopownerExample shopownerExample = new ShopownerExample();
        ShopownerExample.Criteria criteria = shopownerExample.createCriteria();
        criteria.andAccountnameEqualTo(accountName);
        criteria.andAccountpwdEqualTo(password);


        List<Shopowner> list = shopownerMapper.selectByExample(shopownerExample);
        for (Shopowner owner :list) {
                return owner.getAccountid();
        }
        return 0;
    }

    @Override
    public int registerShopowner() throws Exception {
        //搁置
        return 0;
    }

    @Override
    public Shopowner getShopownerInf(int userId) throws Exception {
        Shopowner owner;

        owner = shopownerMapper.selectByPrimaryKey(userId);
        return owner;
    }


}
