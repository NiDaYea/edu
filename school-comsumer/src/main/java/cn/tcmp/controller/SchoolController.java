package cn.tcmp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("school")
public class SchoolController {

    @RequestMapping("toindex")
    public String toindex(){
        return "index";
    }







}
