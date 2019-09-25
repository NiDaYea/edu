package cn.tcmp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("toIndex")
    public String toIndex(){
        return "index";
    }
    @RequestMapping("toAbout")
    public String toAbout(){
        return "about";
    }

    @RequestMapping("toLessons")
    public String toLessons(){
        return "lessons";
    }
    @RequestMapping("toMail")
    public String toMail(){
        return "mail";
    }
    @RequestMapping("toTypography")
    public String toTypography(){
        return "typography";
    }

}
