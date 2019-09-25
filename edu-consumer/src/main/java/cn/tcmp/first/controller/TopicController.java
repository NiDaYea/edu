package cn.tcmp.first.controller;

import cn.tcmp.first.entity.Topic;
import cn.tcmp.first.entity.Wrong;
import cn.tcmp.first.service.TopicService;
import cn.tcmp.first.service.WrongService;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Provider;
import java.util.List;

@Controller
public class TopicController {

    @Reference
    private TopicService topicService;

    @Reference
    private WrongService wrongService;

    //随机100道题目和答案
    @RequestMapping("queryByYIbai")
    public String queryByYIbai(Integer topicCode, Model model){
        List<Topic> topic = topicService.queryByYIbai(topicCode);
        for (Topic topic1 : topic) {
            topic1.setListanswer(topicService.queryAnswer(topic1.getTopicId()));
        }
        String s = JSON.toJSONString(topic);
        model.addAttribute("topic", s);
        return "answer";
    }

    //考试分类选择页面
    @RequestMapping("toKaoShi")
    public String toKaoShi(){
        return "kaoshi";
    }

    //顺序练习  查询所有题和答案
    @RequestMapping("toShunXu")
    public String toShunXi(Integer topicCode, Model model){
        List<Topic> topics = topicService.queryAll(1);
        System.out.println(topics);
        model.addAttribute("topic",topics);
        return "shunxu";
    }

    //去错题练习页面
    @RequestMapping("toCuoTi")
    public String toCuoTi(Integer topicCode,Model model){
        //token取userid
        List<Topic> a = wrongService.queryAll(1,1);
        System.out.println(a);
        model.addAttribute("topic", a);
        return "cuoti";
    }

    //添加错题
    @ResponseBody
    @RequestMapping("addCuoTi")
    public String addCuoTi(Wrong wrong){
        if(wrongService.saveWrong(wrong)>0){
            return "ok";
        }
        return "error";
    }

    //删除错题
    @ResponseBody
    @RequestMapping("delCuoTi")
    public String delCuoTi(Wrong wrong){
        if(wrongService.delWrong(wrong)>0){
            return "ok";
        }
        return "error";
    }
}
