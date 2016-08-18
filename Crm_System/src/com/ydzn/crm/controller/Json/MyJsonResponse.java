package com.ydzn.crm.controller.Json;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServletResponse;
import java.util.Collection;
import java.util.List;

/**
 * Created by HeathHose on 2016/8/4.
 */
public class MyJsonResponse {

    static JSONArray jsonArray;
    static JSONObject jsonObject;

    public static JSONArray getJsonArray() {
        return jsonArray;
    }

    public static JSONObject getJsonObject() {
        return jsonObject;
    }


    //封装list
    public static void responseList(HttpServletResponse response, Collection list) throws Exception{

        response.setContentType("text/html; charset=GBk");
        response.getWriter().println(JSON.toJSONStringWithDateFormat(list, "yyyy-MM-dd HH:mm:ss.SSS"));

    }

    //封装pojo
    public static void responsePojo(HttpServletResponse response, Object object) throws Exception{

        response.getWriter().println(JSON.toJSONString(object));
    }

    //封装简单类型
    public static void responseObject(HttpServletResponse response, String str, Object object)throws Exception{
        initial();
        if(jsonObject == null){
            jsonObject = new JSONObject();
            jsonObject.put(str,object);

            response.getWriter().println(jsonObject.toString());
        }
    }

    ////添加错误
    //public static void addError(HttpServletResponse response,String Error) throws Exception {
    //    if(getJsonArray() != null){
    //            jsonObject.put("Error",Error);
    //
    //    }else {
    //        jsonObject.put("Error",Error);
    //        System.out.println(getJsonObject().toString());
    //    }
    //}

    public static void initial(){
        jsonArray=null;
        jsonObject=null;
    }
}
