package com.ydzn.crm.po;

public class Goods {
    private Integer goodsid;

    private String goodsname;

    private Float goodsmoney;

    private Long goodsstorage;

    private byte[] goodspic;

    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public Float getGoodsmoney() {
        return goodsmoney;
    }

    public void setGoodsmoney(Float goodsmoney) {
        this.goodsmoney = goodsmoney;
    }

    public Long getGoodsstorage() {
        return goodsstorage;
    }

    public void setGoodsstorage(Long goodsstorage) {
        this.goodsstorage = goodsstorage;
    }

    public byte[] getGoodspic() {
        return goodspic;
    }

    public void setGoodspic(byte[] goodspic) {
        this.goodspic = goodspic;
    }
}