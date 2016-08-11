package com.json.test;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HeathHose on 2016/8/4.
 */
public class jsonTest {


    public static void main(String[] args) throws Exception{
        JSONObject jsonObject = new JSONObject();

        Entity en = new Entity();
        en.setId(1);
        en.setName("jj");
        Entity ti = new Entity();
        ti.setId(2);
        ti.setName("hh");

        jsonObject.put("en",en);

        List<Entity> list = new ArrayList<Entity>();
        list.add(en);
        list.add(ti);

        JSONArray jsonArray = new JSONArray(list);
        System.out.println(jsonArray.toString());
        //System.out.println(jsonObject.toString());

    }
}
