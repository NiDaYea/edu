package cn.tcmp.first.controller;

import cn.tcmp.first.entity.Topic;
import cn.tcmp.first.service.TopicService;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Provider;
import java.util.List;

@Controller
public class TopicController {

    @Reference
    private TopicService topicService;

    //随机100道题目和答案
    @RequestMapping("queryByYIbai")
    public String queryByYIbai(Integer topicCode, Model model){
        List<Topic> topic = topicService.queryByYIbai(1);
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

}
