package com.ydzn.crm.controller.Json;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

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
        initial();
        if(jsonArray == null){
            jsonArray = new JSONArray(list);
            response.setContentType("text/html; charset=GBk");
            response.getWriter().println(jsonArray.toString());
        }

    }

    //封装pojo
    public static void responsePojo(HttpServletResponse response, Object object) throws Exception{
        initial();
        if(jsonObject == null){
            JSONObject jsonObject = new JSONObject(object);
            response.setContentType("text/html; charset=GBk");
            response.getWriter().println(jsonObject.toString());
        }

    }

    //封装简单类型
    public static void responseObject(HttpServletResponse response, String str, Object object)throws Exception{
        initial();
        if(jsonObject == null){
            jsonObject = new JSONObject().put(str,object);
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
