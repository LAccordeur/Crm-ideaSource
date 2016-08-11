package com.ydzn.crm.controller;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.ydzn.crm.controller.Json.MyJsonResponse;
import com.ydzn.crm.po.Activity;
import com.ydzn.crm.service.ActivityService;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

/**
 * Created by HeathHose on 2016/8/4.
 */
@Controller
@RequestMapping("/Crm_system")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    //查看已编辑的活动详情
    @RequestMapping("/getActivityInfo")
    public void getActivityInfo(HttpServletResponse response) throws Exception{

        List<Activity> list = activityService.getActivityInfo();
        // 把list封装成JSONArray
        // 输出响应
        MyJsonResponse.responseList(response,list);
    }

    //更新活动信息
    @RequestMapping("/updateActivityInf")
    public void updateActivityInfo(HttpServletRequest request,HttpServletResponse response) throws  Exception{
        String activityID = request.getParameter("ActivityID");
        Activity activity = (Activity) request.getAttribute("Activity");

        //测试数据
        //String activityID="3";
        //Activity activity = new Activity();
        //activity.setActivityid(Integer.parseInt(activityID));
        //activity.setAccountid(1);
        //activity.setActivityname("跳楼2");
        //activity.setActivitystarttime(new Date());
        //activity.setActivitycuttime(new Date());

        boolean bool = activityService.updateActivityInfo(Integer.parseInt(activityID),activity);

        // 把bool封装成JSONObject
        // 输出响应
        MyJsonResponse.responseObject(response,"boolean",bool);
    }

    //更新活动状态
    @RequestMapping("/updateAcitvityState")
    public void updateAcitvityState(HttpServletRequest request,HttpServletResponse response) throws Exception{

        //Boolean bool =  Boolean.parseBoolean(request.getParameter("boolean"));
        //int activityID = Integer.parseInt(request.getParameter("activityID"));

        //测试数据
        Boolean bool = true;
        int activityID=1;

        Boolean state = activityService.updateAcitvityState(activityID,bool);

        // 把bool封装成JSONObject
        // 输出响应
        MyJsonResponse.responseObject(response,"boolean",state);


    }

    //新增已编辑活动
    @RequestMapping("/insertActivity")
    public void insertActivity(HttpServletRequest request,HttpServletResponse response) throws Exception{
        //Activity activity = (Activity) request.getAttribute("Activity");

        //测试数据
        Activity activity = new Activity();
        activity.setAccountid(1);
        activity.setActivityname("超级无敌活动");
        activity.setAcitvitystate(false);

        if(activityService.insertActivity(activity)){
            // 把bool封装成JSONObject
            // 输出响应
            MyJsonResponse.responseObject(response,"boolean",true);
        }
    }

}
