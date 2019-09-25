package cn.tcmp.dao;

import cn.tcmp.entity.Type;

import java.util.List;

public interface TypeMapper {

    //查询所有汽车状态
    List<Type> queryStatu(String typeCode);
    //查询所有汽车类型
    List<Type> querytypeCar(String typeCode);

}
