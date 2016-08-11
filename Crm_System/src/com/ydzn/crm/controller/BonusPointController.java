package com.ydzn.crm.controller;

import com.ydzn.crm.controller.Json.MyJsonResponse;
import com.ydzn.crm.po.Customer;
import com.ydzn.crm.service.BonusPointService;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.misc.Contended;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static javafx.scene.input.KeyCode.J;

/**
 * Created by HeathHose on 2016/8/3.
 */
@Controller

public class BonusPointController {

    @Autowired
    private BonusPointService bonusPointService;

    //录入积分 添加消费记录
    @RequestMapping("/logCredit")
    public void logCredit(HttpServletRequest request, HttpServletResponse response) throws Exception{

        int telephoneNumber = Integer.parseInt(request.getParameter("TelephoneNumber"));
        int bonusPoint = Integer.parseInt(request.getParameter("BonusPoint"));
        HashMap<Integer,Integer> goodsMap = (HashMap<Integer, Integer>) request.getAttribute("goodsMap");

        //测试数据
        //HashMap<Integer,Integer> goodsMap = new HashMap<Integer, Integer>();
        //goodsMap.put(1,1);
        //goodsMap.put(2,1);
        //goodsMap.put(3,1);
        //int telephoneNumber = 234;
        //int bonusPoint = 33;

        if(bonusPointService.logCreditAndHistory(telephoneNumber,bonusPoint,goodsMap)){
            //使用自定义json处理，响应客户端
            MyJsonResponse.responseObject(response,"boolean",true);
        }
    }

    // 查看会员列表（显示会员积分榜）
    @RequestMapping("/getCustomersCredit")
    public  void getCustomersCreditByOrder(HttpServletResponse response) throws Exception{
        List<Customer> list =  bonusPointService.getCustomersCreditByOrder();
        //list.get(0);
        if(list !=null){

            // 把list封装成JSONArray
            // 输出响应
            MyJsonResponse.responseList(response,list);
        }

    }
}
