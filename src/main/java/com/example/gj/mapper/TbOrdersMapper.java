package com.example.gj.mapper;

import com.example.gj.entities.TbOrders;
import com.example.gj.entities.TbOrdersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbOrdersMapper {
    int countByExample(TbOrdersExample example);

    int deleteByExample(TbOrdersExample example);

    int deleteByPrimaryKey(String ordersNo);

    int insert(TbOrders record);

    int insertSelective(TbOrders record);

    List<TbOrders> selectByExample(TbOrdersExample example);

    TbOrders selectByPrimaryKey(String ordersNo);

    int updateByExampleSelective(@Param("record") TbOrders record, @Param("example") TbOrdersExample example);

    int updateByExample(@Param("record") TbOrders record, @Param("example") TbOrdersExample example);

    int updateByPrimaryKeySelective(TbOrders record);

    int updateByPrimaryKey(TbOrders record);
}