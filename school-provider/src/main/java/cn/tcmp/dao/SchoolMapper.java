package cn.tcmp.dao;

import cn.tcmp.entity.Coach;

import java.util.List;

public interface SchoolMapper {
    //查询所有教练
    List<Coach> queryAll();
    Integer addCoach(Coach coach);



}
