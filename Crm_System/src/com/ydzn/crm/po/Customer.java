package com.ydzn.crm.po;

public class Customer {
    private Integer customid;

    private String telephonenumber;

    private String customname;

    private Long bonuspoint;

    public Integer getCustomid() {
        return customid;
    }

    public void setCustomid(Integer customid) {
        this.customid = customid;
    }

    public String getTelephonenumber() {
        return telephonenumber;
    }

    public void setTelephonenumber(String telephonenumber) {
        this.telephonenumber = telephonenumber == null ? null : telephonenumber.trim();
    }

    public String getCustomname() {
        return customname;
    }

    public void setCustomname(String customname) {
        this.customname = customname == null ? null : customname.trim();
    }

    public Long getBonuspoint() {
        return bonuspoint;
    }

    public void setBonuspoint(Long bonuspoint) {
        this.bonuspoint = bonuspoint;
    }
}