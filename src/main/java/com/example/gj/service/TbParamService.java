package com.example.gj.service;

import com.example.gj.entities.TbParam;

import java.util.List;

/**
 * @author ：Cxl
 * @date ：Created in 2019/6/4 15:30
 * @description：1
 */
public interface TbParamService {
    List<TbParam> getParam(String a);

    int del(String id);

    int edit(TbParam param);

    int add(TbParam param);
}
