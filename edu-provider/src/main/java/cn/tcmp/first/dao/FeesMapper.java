package cn.tcmp.first.dao;

import cn.tcmp.first.entity.Fees;

import java.util.List;

public interface FeesMapper {

    //查询所有班型及价格
    List<Fees> queryAll();

    //二级联动查看班型(报名用)
    List<Fees> queryClass(String license);
}
