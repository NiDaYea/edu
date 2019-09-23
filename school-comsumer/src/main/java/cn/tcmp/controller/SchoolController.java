package cn.tcmp.controller;

import cn.tcmp.entity.Car;
import cn.tcmp.entity.Coach;
import cn.tcmp.entity.User;
import cn.tcmp.service.CarService;
import cn.tcmp.service.SchoolService;
import cn.tcmp.service.UserService;
import cn.tcmp.util.pageutil.PageUtil;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("school")
public class SchoolController {
    @Reference
    private SchoolService schoolService;
    @Reference
    private CarService carService;
    //去后台首页
    @RequestMapping("go")
    public String houtai(){
        return "index1";
    }

   //查询所有教练信息
    @RequestMapping("queryAllcoach")
    public String toIndex(Model model,Integer pageNo,Integer pageSize){
        if(pageNo==null){
            pageNo=1;
        }
        if(pageSize==null){
            pageSize=1;
        }
      PageUtil<Coach> pageUtil=schoolService.queryAll(pageNo,pageSize);
        model.addAttribute("pageUtil",pageUtil);
        return "caoah_list";
    }
    //查询所有汽车信息
    @ResponseBody
    @RequestMapping(value="queryCar",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
    public String queryCar(Integer carvalueId){
     List<Car> list=carService.queryCar( carvalueId);
     return JSON.toJSONString(list);
    }
    //添加教练
    @ResponseBody
    @RequestMapping("addCoach")
   public String addCoath(Coach coach){
       Integer count=schoolService.addCoach(coach);
       if(count>0){
           return "ok";
       }
       return "error";
    }
    //查询所有学员








}
