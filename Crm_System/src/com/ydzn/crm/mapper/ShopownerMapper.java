package com.ydzn.crm.mapper;

import com.ydzn.crm.po.Shopowner;
import com.ydzn.crm.po.ShopownerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopownerMapper {
    int countByExample(ShopownerExample example);

    int deleteByExample(ShopownerExample example);

    int deleteByPrimaryKey(Integer accountid);

    int insert(Shopowner record);

    int insertSelective(Shopowner record);

    List<Shopowner> selectByExampleWithBLOBs(ShopownerExample example);

    List<Shopowner> selectByExample(ShopownerExample example);

    Shopowner selectByPrimaryKey(Integer accountid);

    int updateByExampleSelective(@Param("record") Shopowner record, @Param("example") ShopownerExample example);

    int updateByExampleWithBLOBs(@Param("record") Shopowner record, @Param("example") ShopownerExample example);

    int updateByExample(@Param("record") Shopowner record, @Param("example") ShopownerExample example);

    int updateByPrimaryKeySelective(Shopowner record);

    int updateByPrimaryKeyWithBLOBs(Shopowner record);

    int updateByPrimaryKey(Shopowner record);
}