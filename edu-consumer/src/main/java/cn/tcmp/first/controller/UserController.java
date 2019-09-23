package cn.tcmp.first.controller;

import cn.tcmp.first.entity.User;
import cn.tcmp.first.service.FeesService;
import cn.tcmp.first.service.TypeService;
import cn.tcmp.first.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Reference
    private UserService userService;

    @Reference
    private TypeService typeService;

    @Reference
    private FeesService feesService;

    //去在线报名页面
    @RequestMapping("toSaveUser")
    public String toSaveUser(Model model) {
        model.addAttribute("driver",typeService.queryDriving());
        return "enroll";
    }

    //根据驾照类型查询班型
    @ResponseBody
    @RequestMapping(value = "queryClass",method = RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
    public String queryClass(String license) {
        return JSON.toJSONString(feesService.queryClass(license));
    }

    //在线报名操作
    @ResponseBody
    @RequestMapping(value = "doSaveUser",method = RequestMethod.POST)
    public String doSaveUser(User user) {
        int count= userService.saveUser(user);
        if (count > 0) {
            return "ok";
        } else {
            return "error";
        }
    }

    //去修改密码
    @RequestMapping("toupdatePassword")
    public String toupdatePassword( Model model) {
        return "";
    }


    //做修改密码操作
    @RequestMapping("doupdatePassword")
    public String doupdatePassword(User user,Model model) {

        return "";
    }


}
