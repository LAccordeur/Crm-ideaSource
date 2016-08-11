package com.ydzn.crm.controller;


import com.ydzn.crm.controller.Json.MyJsonResponse;
import com.ydzn.crm.po.Shopowner;
import com.ydzn.crm.service.ShopownerService;
import com.ydzn.crm.service.impl.ShopownerServiceIml;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * Created by HeathHose on 2016/7/29.
 */

@Controller
public class ShopownerController {

    @Autowired
    public ShopownerService shopownerServiceIml;

    //商家登陆
    @RequestMapping("/validateShopowner")
    public void validateShopowner(HttpServletRequest request, HttpServletResponse response)throws Exception{
        String user = request.getParameter("AccountUser");
        String pwd = request.getParameter("AccountPwd");
        int userId = shopownerServiceIml.shopownerValidate(user,pwd);
        if (userId > 0)
        {
            request.getSession(true).setAttribute("userId" , userId);
        }
        // 把验证的userId封装成JSONObject
        // 输出响应
        MyJsonResponse.responseObject(response,"userID",userId);
    }

    //获取商家信息
    @RequestMapping("/getShopownerInf")
    public void getShopownerInf(HttpServletRequest request, HttpServletResponse response) throws Exception{
        int userID=1;
        Shopowner owner;

        //userID= Integer.parseInt(request.getParameter("userID"));
        owner = shopownerServiceIml.getShopownerInf(userID);
        if(owner != null){
            // 把owner封装成JSONObject
            // 输出响应
            MyJsonResponse.responsePojo(response,owner);
        }

    }

    //更新商家信息
    @RequestMapping("/updateShopownerInf")
    public  void updateShopownerInf(HttpServletRequest request, HttpServletResponse response) throws Exception{
        String userID = request.getParameter("AccountID");
        Shopowner owner = (Shopowner) request.getAttribute("shopowner");

        //测试数据
        //        userID="6";
        //        Shopowner owner = new Shopowner();
        //        owner.setAccountid(6);
        //        owner.setAccountname("supermary");
        //        owner.setAccountaddress("成都");
        //        owner.setOpeningtime(new Date());
        //        owner.setClosingtime(new Date());

        if(shopownerServiceIml.updateShopownerInf(Integer.parseInt(userID),owner)){
            // 把boolean值封装成JSONObject
            // 输出响应
            MyJsonResponse.responseObject(response,"boolean",true);
        }
    }

    //获取日销售额（默认当前时间日期）
    @RequestMapping("/getDailySales")
    public void getDailySales(HttpServletResponse response) throws Exception {
        int money = -1;
        money = shopownerServiceIml.getDailySales();
        if(money > -1){
            // 把money值封装成JSONObject
            // 输出响应
            MyJsonResponse.responseObject(response,"DailySales",money);
        }
    }

    //获取月销售额
    @RequestMapping("/getMonthlySales")
    public void getMonthlySales(HttpServletResponse response) throws Exception {
        int money = -1;
        money = shopownerServiceIml.getMonthlySales();
        if(money > -1){
            // 把money值封装成JSONObject
            // 输出响应
            MyJsonResponse.responseObject(response,"MonthlySales",money);
        }
    }

    //获取年销售额
    @RequestMapping("/getYearlySales")
    public void getYearlySales(HttpServletResponse response) throws Exception {
        int money = -1;
        money = shopownerServiceIml.getYearlySales();
        if(money > -1){
            // 把money值封装成JSONObject
            // 输出响应
            MyJsonResponse.responseObject(response,"YearlySales",money);
        }
    }

}
