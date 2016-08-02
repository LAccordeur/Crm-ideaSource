package com.ydzn.crm.po;

import java.util.Date;

public class Shopowner {
    private Integer accountid;

    private String accountname;

    private String accountpwd;

    private String accountaddress;

    private Date openingtime;

    private Date closingtime;

    private String accountdetail;

    private byte[] accountpic;

    public Integer getAccountid() {
        return accountid;
    }

    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname == null ? null : accountname.trim();
    }

    public String getAccountpwd() {
        return accountpwd;
    }

    public void setAccountpwd(String accountpwd) {
        this.accountpwd = accountpwd == null ? null : accountpwd.trim();
    }

    public String getAccountaddress() {
        return accountaddress;
    }

    public void setAccountaddress(String accountaddress) {
        this.accountaddress = accountaddress == null ? null : accountaddress.trim();
    }

    public Date getOpeningtime() {
        return openingtime;
    }

    public void setOpeningtime(Date openingtime) {
        this.openingtime = openingtime;
    }

    public Date getClosingtime() {
        return closingtime;
    }

    public void setClosingtime(Date closingtime) {
        this.closingtime = closingtime;
    }

    public String getAccountdetail() {
        return accountdetail;
    }

    public void setAccountdetail(String accountdetail) {
        this.accountdetail = accountdetail == null ? null : accountdetail.trim();
    }

    public byte[] getAccountpic() {
        return accountpic;
    }

    public void setAccountpic(byte[] accountpic) {
        this.accountpic = accountpic;
    }
}