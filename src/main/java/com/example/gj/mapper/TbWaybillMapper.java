package com.example.gj.mapper;

import com.example.gj.entities.TbWaybill;
import com.example.gj.entities.TbWaybillExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbWaybillMapper {
    int countByExample(TbWaybillExample example);

    int deleteByExample(TbWaybillExample example);

    int deleteByPrimaryKey(String waybillNo);

    int insert(TbWaybill record);

    int insertSelective(TbWaybill record);

    List<TbWaybill> selectByExample(TbWaybillExample example);

    TbWaybill selectByPrimaryKey(String waybillNo);

    int updateByExampleSelective(@Param("record") TbWaybill record, @Param("example") TbWaybillExample example);

    int updateByExample(@Param("record") TbWaybill record, @Param("example") TbWaybillExample example);

    int updateByPrimaryKeySelective(TbWaybill record);

    int updateByPrimaryKey(TbWaybill record);
}