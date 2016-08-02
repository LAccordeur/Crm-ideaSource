package com.ydzn.crm.mapper;

import com.ydzn.crm.po.Purchasehistory;
import com.ydzn.crm.po.PurchasehistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchasehistoryMapper {
    int countByExample(PurchasehistoryExample example);

    int deleteByExample(PurchasehistoryExample example);

    int deleteByPrimaryKey(Integer recordid);

    int insert(Purchasehistory record);

    int insertSelective(Purchasehistory record);

    List<Purchasehistory> selectByExample(PurchasehistoryExample example);

    Purchasehistory selectByPrimaryKey(Integer recordid);

    int updateByExampleSelective(@Param("record") Purchasehistory record, @Param("example") PurchasehistoryExample example);

    int updateByExample(@Param("record") Purchasehistory record, @Param("example") PurchasehistoryExample example);

    int updateByPrimaryKeySelective(Purchasehistory record);

    int updateByPrimaryKey(Purchasehistory record);
}