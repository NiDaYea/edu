package cn.tcmp.first.controller;

import cn.tcmp.first.entity.User;
import cn.tcmp.first.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Reference
    private UserService userService;

    //去在线报名页面
    @RequestMapping("toSaveUser")
    public String toSaveUser() {
        return "";
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
    public String doupdatePassword(User user,Model model) {

        return "";
    }


}
