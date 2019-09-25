package cn.tcmp.service;

import cn.tcmp.dao.CarMapper;
import cn.tcmp.entity.Car;
import cn.tcmp.util.pageutil.PageUtil;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarMapper carMapper;

    @Override
    public PageUtil<Car> queryAllCar(Integer pageNo,Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Car> list=carMapper.queryAllCar();
        PageInfo<Car> pageInfo=new PageInfo<>(list);
        PageUtil<Car> pageUtil=new PageUtil<>();
        pageUtil.setPageNo(pageInfo.getPageNum());
        pageUtil.setPageSize(pageInfo.getPageSize());
        pageUtil.setTotalPageCount(pageInfo.getPages());
        pageUtil.setNavigatepageNums(pageInfo.getNavigatepageNums());
        pageUtil.setList(pageInfo.getList());
        return pageUtil;
    }

    @Override
    public Integer addCar(Car car) {
        return carMapper.addCar(car);
    }

    @Override
    public List<Car> queryCar(Integer carvalueId) {
        return carMapper.queryCar(carvalueId);
    }

    @Override
    public Integer updateCar(Car car) {
        return carMapper.updateCar(car);
    }

    @Override
    public Car queryoneCar(Integer carId) {
        return carMapper.queryoneCar(carId);
    }


}
