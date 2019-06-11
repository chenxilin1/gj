package com.example.gj.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.example.gj.config.ResultMap;
import com.example.gj.entities.TbQing;
import com.example.gj.entities.ZONG;
import com.example.gj.service.TbQingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * @author ：Cxl
 * @date ：Created in 2019/6/4 9:18
 * @description：1
 */
@Controller
@RequestMapping("/one")
public class TbOneController {

    @Resource
    TbQingService tbQingService;

    @GetMapping("/b")
    public String b(){
        return "one/b";
    }

    @GetMapping (value = "/qing")
    @ResponseBody
    public ResultMap<List<ZONG>> getfu(){
        List<ZONG>  idTest=tbQingService.getfu("1");
        return new ResultMap<List<ZONG>>("",idTest,0,0);
    }

    @RequestMapping("/del")
    @ResponseBody
    public int del(HttpServletRequest request){
        String id=request.getParameter("id");
        int i=tbQingService.delbyid(id);
        return i;
    }
    @RequestMapping("/edit")
    @ResponseBody
    public int edit(HttpServletRequest request){
        String id=request.getParameter("id");
        String word=request.getParameter("word");
        String listTxt = JSONArray.toJSONString(word);
        ZONG orders = (ZONG) JSON.parseObject(word, ZONG.class);
        TbQing qing=new TbQing();
        qing.setQingNo(id);
        qing.setOrdersNo(orders.getOrdersdetails().getOrdersNo());
        qing.setWaybillNo(orders.getTbWaybill().getWaybillNo());
        qing.setPayNo(orders.getTbPay().getPayNo());
        qing.setStauts(orders.getStatus());
        qing.setCreateTime(new Date());
        int i=tbQingService.updateByid(qing);
        return i;
    }
    @RequestMapping("/fangxing")
    @ResponseBody
    public int fangxing(HttpServletRequest request) {
        String id =request.getParameter("id");
        String status="7";
        TbQing qing=new TbQing();
        qing.setQingNo(id);
        qing.setStauts(status);
        qing.setCreateTime(new Date());
        int a= tbQingService.FX(qing);
       return  a;
    }
}
