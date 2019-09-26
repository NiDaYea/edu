package cn.tcmp.dao;

import cn.tcmp.entity.About;

import java.util.List;

public interface AboutMapper {

    //后台约车管理
    List<About> queryAll();
}
