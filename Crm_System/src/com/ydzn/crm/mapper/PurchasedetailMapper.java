package com.ydzn.crm.mapper;

import com.ydzn.crm.po.Purchasedetail;
import com.ydzn.crm.po.PurchasedetailExample;
import com.ydzn.crm.po.PurchasedetailKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchasedetailMapper {
    int countByExample(PurchasedetailExample example);

    int deleteByExample(PurchasedetailExample example);

    int deleteByPrimaryKey(PurchasedetailKey key);

    int insert(Purchasedetail record);

    int insertSelective(Purchasedetail record);

    List<Purchasedetail> selectByExample(PurchasedetailExample example);

    Purchasedetail selectByPrimaryKey(PurchasedetailKey key);

    int updateByExampleSelective(@Param("record") Purchasedetail record, @Param("example") PurchasedetailExample example);

    int updateByExample(@Param("record") Purchasedetail record, @Param("example") PurchasedetailExample example);

    int updateByPrimaryKeySelective(Purchasedetail record);

    int updateByPrimaryKey(Purchasedetail record);
}