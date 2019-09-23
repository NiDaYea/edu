package cn.tcmp.service;

import cn.tcmp.entity.Car;
import cn.tcmp.util.pageutil.PageUtil;

import java.util.List;

public interface CarService {

   //查询所有车辆
    PageUtil<Car> queryAllCar(Integer pageNo,Integer pageSize);
    //添加车辆
    Integer addCar(Car car);
    //查询所有可用车辆
    List<Car> queryCar(Integer carvalueId);
    //修改车辆信息
    Integer updateCar(Integer carId);
    //查询一个车辆的信息
    Car queryoneCar(Integer carId);







}
