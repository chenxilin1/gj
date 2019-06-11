package com.example.gj.mapper;

import com.example.gj.entities.TbUser;
import com.example.gj.entities.TbUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserMapper {
   TbUser getuser(TbUser user);
}