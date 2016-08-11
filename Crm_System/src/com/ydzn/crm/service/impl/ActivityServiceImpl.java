package com.ydzn.crm.service.impl;

import com.ydzn.crm.mapper.ActivityExtendMapper;
import com.ydzn.crm.mapper.ActivityMapper;
import com.ydzn.crm.po.Activity;
import com.ydzn.crm.po.ActivityExample;
import com.ydzn.crm.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * Created by HeathHose on 2016/8/3.
 */
@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityMapper activityMapper;
    @Autowired
    private ActivityExtendMapper activityExtendMapper;

    //查看已编辑的活动详情
    @Override
    public List<Activity> getActivityInfo() throws Exception {

        ActivityExample activityExample = new ActivityExample();
        ActivityExample.Criteria criteria = activityExample.createCriteria();
        criteria.andAccountidIsNotNull();

        //获取活动信息
        List<Activity> list = activityMapper.selectByExample(activityExample);

        return list;
    }

    //更新活动信息
    @Override
    public boolean updateActivityInfo(int activityID,Activity activity) throws Exception{

        //activity.setActivityid(activityID);

        if(activityMapper.updateByPrimaryKeyWithBLOBs(activity)>0)
            return  true;
        return false;
    }

    //发布已编辑活动
    //bool代表活动是否上线
    @Override
    public boolean updateAcitvityState(int activityID,Boolean activityState) throws Exception{

        HashMap<String,Object> map = new HashMap<String, Object>();
        map.put("activityState",activityState);
        map.put("activityID",activityID);

        if(activityExtendMapper.updateAcitvityState(map) > 0)
            return  true;
        return false;
    }

    @Override
    public boolean insertActivity(Activity activity) throws Exception {

        return activityExtendMapper.insertActivity(activity);
    }
}
