package com.ydzn.crm.service;

import com.ydzn.crm.po.Activity;

import java.util.List;

/**
 * Created by HeathHose on 2016/8/2.
 */
public interface ActivityService {
    //查看已编辑的活动详情
    public List<Activity> getActivityInfo() throws Exception;

    //保存已编辑活动内容
    public boolean updateActivityInfo(int activityID,Activity activity) throws Exception;

    //发布已编辑活动
    public boolean updateAcitvityState(int activityID,Boolean bool) throws Exception;

    //新增已编辑活动
    public boolean insertActivity(Activity activity) throws Exception;
}
