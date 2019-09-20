package cn.tcmp.first.service;

import cn.tcmp.first.entity.Type;

import java.util.List;

public interface TypeService {

    //报名时查询驾照等级
    List<Type> queryDriving();

    //报名时查询报名类型
    List<Type> queryEnroll();
}
