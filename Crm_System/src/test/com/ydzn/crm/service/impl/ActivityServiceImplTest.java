package com.ydzn.crm.service.impl;

import com.ydzn.crm.po.Activity;
import com.ydzn.crm.service.ActivityService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Created by HeathHose on 2016/8/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:**/applicationContext-*.xml","classpath*:**/springmvc.xml"})
public class ActivityServiceImplTest {
    @Autowired
    private ActivityService activityService;
    @Test
    public void updateActivityInfo() throws Exception {

        String activityID="3";
        Activity activity = new Activity();
        activity.setActivityid(Integer.parseInt(activityID));
        activity.setAccountid(1);
        activity.setActivityname("跳楼");
        activity.setActivitystarttime(new Date());
        activity.setActivitycuttime(new Date());

        activityService.updateActivityInfo(Integer.parseInt(activityID),activity);

        //测试HashMap的键值唯一性
        //HashMap<String,Object> map = new HashMap<String, Object>();
        //map.put("state",1);
        //Boolean bool = true;
        //map.put("hh",bool);
        //
        //map.put("hh","chongfu");
        //
        //System.out.println(map.get("hh"));



    }

}