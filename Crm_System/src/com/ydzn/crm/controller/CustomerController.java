package com.ydzn.crm.controller;

import com.ydzn.crm.controller.Json.MyJsonResponse;
import com.ydzn.crm.mapper.CustomerMapper;
import com.ydzn.crm.po.Activity;
import com.ydzn.crm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by HeathHose on 2016/8/5.
 */
@Controller

public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerMapper customerMapper;

    //查看已发布活动
    @RequestMapping("/seeAcitvityInf")
    public void seeAcitvityInf(HttpServletResponse response) throws Exception{

        List<Activity> list = customerService.seeAcitvityInf();

        // 把list封装成JSONArray
        // 输出响应
        MyJsonResponse.responseList(response,list);

    }
}
