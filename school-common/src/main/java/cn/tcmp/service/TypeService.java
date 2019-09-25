package cn.tcmp.service;

import cn.tcmp.entity.Car;
import cn.tcmp.entity.Type;

import java.util.List;

public interface TypeService {
    //查询所有汽车状态
    List<Type> queryStatu(String typeCode);

    //查询所有汽车类型
    List<Type> querytypeCar(String typeCode);

}
