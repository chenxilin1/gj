package com.example.gj.mapper;

import com.example.gj.entities.TbOrdersdetails;
import com.example.gj.entities.TbOrdersdetailsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbOrdersdetailsMapper {
    int countByExample(TbOrdersdetailsExample example);

    int deleteByExample(TbOrdersdetailsExample example);

    int deleteByPrimaryKey(String ordersdetailsNo);

    int insert(TbOrdersdetails record);

    int insertSelective(TbOrdersdetails record);

    List<TbOrdersdetails> selectByExample(TbOrdersdetailsExample example);

    TbOrdersdetails selectByPrimaryKey(String ordersdetailsNo);

    int updateByExampleSelective(@Param("record") TbOrdersdetails record, @Param("example") TbOrdersdetailsExample example);

    int updateByExample(@Param("record") TbOrdersdetails record, @Param("example") TbOrdersdetailsExample example);

    int updateByPrimaryKeySelective(TbOrdersdetails record);

    int updateByPrimaryKey(TbOrdersdetails record);
}