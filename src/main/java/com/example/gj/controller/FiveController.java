package com.example.gj.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.example.gj.config.Page;
import com.example.gj.config.ResultMap;
import com.example.gj.entities.TbQing;
import com.example.gj.entities.ZONG;
import com.example.gj.service.PageService;
import com.example.gj.service.TbQingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author ：Cxl
 * @date ：Created in 2019/6/4 11:16
 * @description：查询统计
 */
@Controller
@RequestMapping("/five")
public class FiveController {
    @Resource
    TbQingService tbQingService;

    @Resource
    PageService pageService;




    @GetMapping("/b")
    public String b(){
        return "five/b";
    }

    @GetMapping (value = "/qing")
    @ResponseBody
    public ResultMap<List<ZONG>> getfu(Page page, HttpServletRequest request,
                                       @RequestParam("limit") int limit){
        page.setRows(limit);
        List<ZONG>contentList=pageService.selectPageList(page);
        int totals=pageService.selectPageCount(page);
        page.setTotalRecord(totals);
//
//        List<ZONG> idTest= new ArrayList<ZONG>();
//           idTest=tbQingService.get();
        return new ResultMap<List<ZONG>>("",contentList,0,totals);
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
        String w =request.getParameter("word");
        String listTxt = JSONArray.toJSONString(w);
        ZONG orders = (ZONG) JSON.parseObject(w, ZONG.class);
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
        String status="3";
        TbQing qing=new TbQing();
        qing.setQingNo(id);
        qing.setStauts(status);
        qing.setCreateTime(new Date());
        int a= tbQingService.FX(qing);
        return  a;
    }

    @RequestMapping("/delall")
    @ResponseBody
    public  int delall(HttpServletRequest request){
        String str=request.getParameter("id");
        String a []=str.split(",");
        int [] arr=new int[a.length];
        for(int i=0;i<a.length;i++){
            arr[i]=Integer.parseInt(a[i]);
        }
      int i=  tbQingService.delall(arr);
        return i;
    }
}
