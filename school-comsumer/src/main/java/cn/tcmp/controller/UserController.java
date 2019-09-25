package cn.tcmp.controller;

import cn.tcmp.entity.User;
import cn.tcmp.service.UserService;
import cn.tcmp.util.pageutil.PageUtil;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {
    @Reference
    private UserService userService;
    //登陆
    @RequestMapping("login")
    public String login(User user,Model model){
        User user1=userService.loginUser(user);
        if(user1==null){
            model.addAttribute("msg","对不起用户名或密码错误");
            return "login";
        }else{
            return "index1";
        }

    }





   //查询所有学员
    @RequestMapping("queryAllUser")
    public String queryAll(String userName,Integer pageNo,Integer pageSize,Model model){
        if(pageNo==null){
            pageNo=1;
        }
        if(pageSize==null){
            pageSize=5;
        }
        PageUtil<User> pageUtil=userService.queryAll(userName,pageNo,pageSize);
        model.addAttribute("pageUtil",pageUtil);
        return "user_list";
    }
    //审核用户
    @ResponseBody
    @RequestMapping("updateUserType")
    public String updateUserType(Integer userId){
        Integer count=userService.updateUserType(userId);
        if(count>0){
            return "ok";
        }else{
            return "error";
        }
    }







}
