package com.ydzn.crm.controller;

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

/**
 * Created by HeathHose on 2016/7/29.
 */

@Controller
//定义根路径
@RequestMapping("/Crm_system")
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
        try
        {
            // 把验证的userId封装成JSONObject
            JSONObject jsonObj = new JSONObject().put("userId" , userId);
            // 输出响应
            response.getWriter().println(jsonObj.toString());
        }
        catch (JSONException ex)
        {
            ex.printStackTrace();
        }
    }

    //获取商家信息
    @RequestMapping("/getShopownerInf")
    public void getShopownerInf(HttpServletRequest request, HttpServletResponse response) throws Exception{
        int userID;
        Shopowner owner;

        userID= Integer.parseInt(request.getParameter("userID"));
        owner = shopownerServiceIml.getShopownerInf(userID);
        if(owner != null){

        }

    }
}
