package com.example.gj.service.impl;

import com.example.gj.config.Page;
import com.example.gj.entities.TbQing;
import com.example.gj.entities.ZONG;
import com.example.gj.mapper.TbQingMapper;
import com.example.gj.mapper.ZONGMapper;
import com.example.gj.service.PageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ：Cxl
 * @date ：Created in 2019/6/4 19:20
 * @description：分页
 */
@Service
public class PageServiceImpl implements PageService {

    @Resource
    ZONGMapper zongMapper;

    @Resource
    TbQingMapper tbQingMapper;

    @Override
    public List<ZONG> selectPageList(Page page) {
        List<ZONG> list=zongMapper.selectPageList(page);
        return list;
    }

    @Override
    public Integer selectPageCount(Page page) {
        return tbQingMapper.selectPageCount(page);
    }
}
