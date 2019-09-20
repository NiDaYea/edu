package cn.tcmp.first.dao;

import cn.tcmp.first.entity.Type;

import java.util.List;

public interface TypeMapper {

    //报名时查询驾照等级
    List<Type> queryDriving();

    //报名时查询报名类型
    List<Type> queryEnroll();
}
