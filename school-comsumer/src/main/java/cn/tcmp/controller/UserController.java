package cn.tcmp.controller;

import cn.tcmp.entity.User;
import cn.tcmp.service.UserService;
import cn.tcmp.util.pageutil.PageUtil;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @Reference
    private UserService userService;
   //查询所有学员
    @RequestMapping("queryAllUser")
    public String queryAll(String userName,Integer pageNo,Integer pageSize,Model model){
        if(pageNo==null){
            pageNo=1;
        }
        if(pageSize==null){
            pageSize=1;
        }
        PageUtil<User> pageUtil=userService.queryAll(userName,pageNo,pageSize);
        model.addAttribute("pageUtil",pageUtil);
        return "user_list";
    }







}
