package com.ydzn.crm.controller;

import com.ydzn.crm.controller.Json.MyJsonResponse;
import com.ydzn.crm.po.Goods;
import com.ydzn.crm.service.GoodsService;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

import static javafx.scene.input.KeyCode.J;

/**
 * Created by HeathHose on 2016/8/2.
 */
@Controller

public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    //获取所有商品
    @RequestMapping("/getGoodsInf")
    public void getGoodsInf(HttpServletResponse response) throws Exception{

        List<Goods> list = goodsService.getGoodsInf();

        // 把list封装成JSONArray
        // 输出响应
        MyJsonResponse.responseList(response,list);

    }

    //更新商品信息
    @RequestMapping("/upadateGoodsInf")
    public void upadateGoodsInf(HttpServletRequest request,HttpServletResponse response) throws Exception{
        String goodsID = request.getParameter("GoodsID");
        Goods good = (Goods)request.getAttribute("Goods");

        //测试数据
        //String goodsID="1";
        //int id = Integer.parseInt(goodsID);
        //Goods good =new Goods();
        //good.setGoodsid(id);
        //good.setGoodsname("超厚被子");
        //good.setGoodsmoney(2.2f);
        //good.setGoodsstorage(22);

        if(goodsService.upadateGoodsInf(Integer.parseInt(goodsID),good)){
            // 把good封装成JSONObject
            // 输出响应
            MyJsonResponse.responsePojo(response,good);
        }
    }

    //插入商品
    @RequestMapping("/insertGoods")
    public void insertGoods(HttpServletRequest request,HttpServletResponse response) throws Exception{
        //Goods goods = (Goods) request.getAttribute("Goods");
        //测试数据
        Goods good =new Goods();
        good.setGoodsname("良心");
        good.setGoodsmoney(2.2f);
        good.setGoodsstorage(22);
        if(goodsService.insertGoods(good)){
            // 把bool封装成JSONObject
            // 输出响应
            MyJsonResponse.responseObject(response,"boolean",true);
        }
    }
    //删除商品ByID
    @RequestMapping("/deleteGoods")
    public void deleteGoods(HttpServletRequest request,HttpServletResponse response) throws Exception{
        //int goodsID = Integer.parseInt(request.getParameter("goodsID"));
        int goodsID = 5;
        if(goodsService.deleteGoods(goodsID)){
            // 把bool封装成JSONObject
            // 输出响应
            MyJsonResponse.responseObject(response,"boolean",true);
        }
    }
}
