package com.example.gj.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.example.gj.config.Random;
import com.example.gj.config.ResultMap;
import com.example.gj.entities.TbParam;
import com.example.gj.entities.TbQing;
import com.example.gj.entities.ZONG;
import com.example.gj.service.TbParamService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author ：Cxl
 * @date ：Created in 2019/6/4 15:29
 * @description：自动审单
 */
@Controller
@RequestMapping("/zidong")
public class ZidongController {


    @Resource
    TbParamService tbParamService;

    @GetMapping("/a")
    public String b(){
        return "zidong/b";
    }

    @GetMapping (value = "/qing")
    @ResponseBody
    public ResultMap<List<TbParam>> getfu(HttpServletRequest request){
        List<TbParam> idTest= new ArrayList<TbParam>();
        idTest=tbParamService.getParam("自动放行基数");
        return new ResultMap<List<TbParam>>("",idTest,0,0);
    }

    @RequestMapping("/del")
    @ResponseBody
    public int del(HttpServletRequest request){
        String id=request.getParameter("id");
        int i=tbParamService.del(id);

        return i;
    }

    @RequestMapping("/edit")
    @ResponseBody
    public int edit(HttpServletRequest request) {
        String id = request.getParameter("id");
        String w = request.getParameter("word");
        String listTxt = JSONArray.toJSONString(w);
        TbParam param = (TbParam) JSON.parseObject(w, TbParam.class);
        TbParam a=new TbParam();
        a.setId(id);
        a.setPid(param.getPid());
        a.setParamType(param.getParamType());
        a.setParamCode(param.getParamCode());
        a.setParamValue(param.getParamValue());
        a.setCreateTime(new Date());
        int i=tbParamService.edit(a);
        return 1;
    }

    @RequestMapping("/add")
    @ResponseBody
    public int add(HttpServletRequest request){
        String id=request.getParameter("userCode");
        String ParamType=request.getParameter("userName");
        String userMobile=request.getParameter("userMobile");
        String userRole=request.getParameter("userRole");
        TbParam tbParam=new TbParam();
        tbParam.setId(Random.getUUID());
        tbParam.setPid(id);
        tbParam.setParamType(ParamType);
        tbParam.setParamCode(userMobile);
        tbParam.setParamValue(userRole);
        tbParam.setCreateTime(new Date());
        int i=tbParamService.add(tbParam);
        return i;
    }
}
