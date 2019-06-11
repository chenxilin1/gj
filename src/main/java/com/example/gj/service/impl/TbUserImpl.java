package com.example.gj.service.impl;

import com.example.gj.entities.TbUser;
import com.example.gj.entities.TbUserExample;
import com.example.gj.mapper.TbUserMapper;
import com.example.gj.service.TbUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ：Cxl
 * @date ：Created in 2019/5/29 10:40
 * @description：1
 */
@Service
public class TbUserImpl implements TbUserService {

    @Resource
    TbUserMapper tbuser;
    @Override
    public TbUser login(TbUser user) {

        TbUser list=tbuser.getuser(user);
        return list ;
    }
}
