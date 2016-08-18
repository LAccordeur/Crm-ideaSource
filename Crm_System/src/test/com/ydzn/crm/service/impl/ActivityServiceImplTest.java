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




    }

}