package cn.tcmp.controller;

import cn.tcmp.entity.Car;
import cn.tcmp.entity.Coach;
import cn.tcmp.entity.Type;
import cn.tcmp.service.CarService;
import cn.tcmp.service.CoachService;
import cn.tcmp.service.TypeService;
import cn.tcmp.util.pageutil.PageUtil;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("car")
public class CarController {
    @Reference
    private CarService carService;
    @Reference
    private TypeService typeService;
    @Reference
    private CoachService coachService;
    //查询所有车辆
    @RequestMapping("queryAllCar")
    public String queryAll(Integer pageNo,Integer pageSize,Model model){
        if(pageNo==null){
            pageNo=1;
        }
        if(pageSize==null){
            pageSize=5;
        }
        PageUtil<Car>pageUtil=carService.queryAllCar(pageNo,pageSize);
        model.addAttribute("pageUtil",pageUtil);
        return "car_list";
    }
   //添加车辆
    @ResponseBody
    @RequestMapping("addCar")
    public String addCar(Car car){
        Integer count=carService.addCar(car);
        if(count>0){
            return "ok";
        }
        return "error";
    }
    //查询所有汽车状态
    @ResponseBody
    @RequestMapping(value="queryStatus",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
    public String queryStatus(String typeCode){
        List<Type> list=typeService.queryStatu(typeCode);
        return JSON.toJSONString(list);
    }
    //查询所有教练姓名
    @ResponseBody
    @RequestMapping(value="queryCoach",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
    public String queryCoach(){
        List<Coach> list=coachService.queryCoach();
        return JSON.toJSONString(list);
    }
  //查询所有汽车类型
    @ResponseBody
    @RequestMapping(value = "querytypeCar",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
    public String querytypeCar(String typeCode){
        List<Type>list=typeService.querytypeCar(typeCode);
        return JSON.toJSONString(list);
    }
    //去修改页面
    @RequestMapping("toUpdateCar")
     public String toUpdate(Integer carId,Model model){
        Car car=carService.queryoneCar(carId);
        model.addAttribute("car",car);
        return "car_update";
    }

    //做修改车辆信息的操作
    @ResponseBody
    @RequestMapping(value="doUpdateCar",method = RequestMethod.POST)
    public String updateCar(Car car){
        Integer count=carService.updateCar(car);
        if(count>0){
            return "ok";
        }
        return "error";
    }

    //查询所有汽车类型
    @ResponseBody
    @RequestMapping(value="queryCarType",method = RequestMethod.GET,produces = {"application/json;charset:UTF-8"})
    public String queryCarType(String typeCode){
        List<Type> list=typeService.querytypeCar(typeCode);
        return JSON.toJSONString(list);
    }
    //查询所有汽车状态
    @ResponseBody
    @RequestMapping(value="queryCarStatu",method = RequestMethod.GET,produces = {"application/json;charset:UTF-8"})
    public String queryCarStatu(String typeCode){
        List<Type> list=typeService.queryStatu(typeCode);
        return JSON.toJSONString(list);
    }










}
