package cn.tcmp.dao;

import cn.tcmp.entity.Car;

import java.util.List;

public interface CarMapper {
    List<Car> queryAllCar();
    Integer addCar(Car car);
    //查询所有可用车辆
    List<Car> queryCar(Integer carvalueId);
    //修改车辆信息
    Integer updateCar(Car car);
    //查询一个车辆的信息
    Car queryoneCar(Integer carId);


}
