package com.example.gj.mapper;

import com.example.gj.entities.TbParam;
import com.example.gj.entities.TbParamExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbParamMapper {
    int countByExample(TbParamExample example);

    int deleteByExample(TbParamExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbParam record);

    int insertSelective(TbParam record);

    List<TbParam> selectByExample(TbParamExample example);

    TbParam selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbParam record, @Param("example") TbParamExample example);

    int updateByExample(@Param("record") TbParam record, @Param("example") TbParamExample example);

    int updateByPrimaryKeySelective(TbParam record);

    int updateByPrimaryKey(TbParam record);

    List<TbParam> findByType(String a);

    int add(TbParam param);
}