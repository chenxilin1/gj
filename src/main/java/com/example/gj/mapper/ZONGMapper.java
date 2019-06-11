package com.example.gj.mapper;

import com.example.gj.config.Page;
import com.example.gj.entities.TbQing;
import com.example.gj.entities.ZONG;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ：Cxl
 * @date ：Created in 2019/5/31 10:30
 * @description：2
 */
public interface ZONGMapper {
    List<ZONG> geta(@Param("b") String a);

    List<ZONG> get();


    //通过关键字分页查询数据列表
    public List<ZONG> selectPageList(Page page);

    //批量删除


}
