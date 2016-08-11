package com.ydzn.crm.mapper;

import com.ydzn.crm.po.Goods;

import java.util.List;
import java.util.Map;

/**
 * Created by HeathHose on 2016/8/3.
 */
public interface GoodsExtendMapper {

    //计算本次消费总额;Map<商品数量，商品ID>
    int getPurchaseHistoryTotal(Map<Integer,Integer> map);

    //添加商品
    int insertGoods(Goods goods);
}
