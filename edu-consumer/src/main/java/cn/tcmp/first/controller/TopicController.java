package cn.tcmp.first.controller;

import cn.tcmp.first.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Provider;

@Controller
public class TopicController {

    @Autowired
    private TopicService topicService;

    //随机100道题目和答案
    @RequestMapping("queryByYIbai")
    public String queryByYIbai(Integer topicCode, Model model){

        System.out.println( topicService.queryByYIbai(topicCode));
        return "404";
    }

}
