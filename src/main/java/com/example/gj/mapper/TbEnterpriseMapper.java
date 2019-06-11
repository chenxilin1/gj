package com.example.gj.mapper;

import com.example.gj.entities.TbEnterprise;
import com.example.gj.entities.TbEnterpriseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbEnterpriseMapper {
    int countByExample(TbEnterpriseExample example);

    int deleteByExample(TbEnterpriseExample example);

    int deleteByPrimaryKey(String cbecodeinsp);

    int insert(TbEnterprise record);

    int insertSelective(TbEnterprise record);

    List<TbEnterprise> selectByExample(TbEnterpriseExample example);

    TbEnterprise selectByPrimaryKey(String cbecodeinsp);

    int updateByExampleSelective(@Param("record") TbEnterprise record, @Param("example") TbEnterpriseExample example);

    int updateByExample(@Param("record") TbEnterprise record, @Param("example") TbEnterpriseExample example);

    int updateByPrimaryKeySelective(TbEnterprise record);

    int updateByPrimaryKey(TbEnterprise record);

}