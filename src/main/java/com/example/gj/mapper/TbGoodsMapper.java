package com.example.gj.mapper;

import com.example.gj.entities.TbGoods;
import com.example.gj.entities.TbGoodsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbGoodsMapper {
    int countByExample(TbGoodsExample example);

    int deleteByExample(TbGoodsExample example);

    int insert(TbGoods record);

    int insertSelective(TbGoods record);

    List<TbGoods> selectByExample(TbGoodsExample example);

    int updateByExampleSelective(@Param("record") TbGoods record, @Param("example") TbGoodsExample example);

    int updateByExample(@Param("record") TbGoods record, @Param("example") TbGoodsExample example);
}