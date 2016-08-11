package com.ydzn.crm.po;

import java.util.Date;

public class Activity {
    private Integer activityid;

    private String activityname;

    private Integer accountid;

    private Date activitystarttime;

    private Date activitycuttime;

    private String activitydetail;

    private Boolean activitystate;

    private byte[] activitypic;

    public Integer getActivityid() {
        return activityid;
    }

    public void setActivityid(Integer activityid) {
        this.activityid = activityid;
    }

    public String getActivityname() {
        return activityname;
    }

    public void setActivityname(String activityname) {
        this.activityname = activityname == null ? null : activityname.trim();
    }

    public Integer getAccountid() {
        return accountid;
    }

    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    public Date getActivitystarttime() {
        return activitystarttime;
    }

    public void setActivitystarttime(Date activitystarttime) {
        this.activitystarttime = activitystarttime;
    }

    public Date getActivitycuttime() {
        return activitycuttime;
    }

    public void setActivitycuttime(Date activitycuttime) {
        this.activitycuttime = activitycuttime;
    }

    public String getActivitydetail() {
        return activitydetail;
    }

    public void setActivitydetail(String activitydetail) {
        this.activitydetail = activitydetail == null ? null : activitydetail.trim();
    }

    public Boolean getAcitvitystate() {
        return activitystate;
    }

    public void setAcitvitystate(Boolean activitystate) {
        this.activitystate = activitystate;
    }

    public byte[] getActivitypic() {
        return activitypic;
    }

    public void setActivitypic(byte[] activitypic) {
        this.activitypic = activitypic;
    }
}