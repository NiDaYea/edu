package cn.tcmp.controller;
import	java.lang.annotation.Retention;
import java.util.List;

import cn.tcmp.dto.TokenDto;
import cn.tcmp.entity.About;
import cn.tcmp.entity.User;
import cn.tcmp.service.SchoolService;
import cn.tcmp.service.TokenService;
import cn.tcmp.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import com.sun.org.apache.bcel.internal.generic.RET;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class YueCar {

    @Reference
    private TokenService tokenService;

    @Reference
    private UserService userService;

    @Reference
    private SchoolService schoolService;
    @ResponseBody
    @RequestMapping(value = "zaiXian", method =RequestMethod.POST)
    public String zaiXian(HttpServletRequest request,Integer userId){
        //1.验证token
        Boolean result=tokenService.checkToken(request.getHeader("token"),
                request.getHeader("User-Agent"));
        if(!result){
            return "toKen验证失败";
        }
        User user=userService.queryUserJD(userId);
        if(user==null){
            return "科目不符合";
        }
        return "1";
    }
    //去在线约车页面
    @RequestMapping("toIcons")
    public String toIcons(Model model,String coathName,Integer carTypevalueId,Integer pageNo,Integer pageSize){
        if(pageNo==null){
            pageNo=1;
        }
        if(pageSize==null){
            pageSize =10;
        }
        model.addAttribute("list",schoolService.queryAll(coathName,carTypevalueId,pageNo,pageSize));
        return "icons";
    }

    //去在线约详细车页面
    @RequestMapping("toYueCar")
    public String toYueCar(Integer coachId,Model model){
        model.addAttribute("detail",schoolService.queryById(coachId));
        model.addAttribute("coachId",coachId);
        return "yeucar";
    }

    @ResponseBody
    @RequestMapping(value="queryAllAbout",method = RequestMethod.POST,
    produces = {"application/json;charset=UTF-8"})
    public List<About> queryAllAbout(Integer coachId, String aboutDate){
        List<About> about=schoolService.queryAllAbout(coachId,aboutDate);
      return  about;
    }

    @ResponseBody
    @RequestMapping(value = "addAbout",method = RequestMethod.POST)
    public String addAbout(About about,String str){
        schoolService.addAbout(about);
        About a=schoolService.queryTop1();
        Integer aboutId=a.getAboutId();
        schoolService.updateAbout(aboutId,str);
        return "预约成功";
    }

    @ResponseBody
    @RequestMapping(value = "queryCountAbout",method = RequestMethod.POST)
    public Integer queryCountAbout(Integer userId){
        return schoolService.queryCountAbout(userId);
    }
}
