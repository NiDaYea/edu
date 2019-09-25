package cn.tcmp.controller;

import cn.tcmp.entity.Answer;
import cn.tcmp.entity.Topic;
import cn.tcmp.service.AnswerService;
import cn.tcmp.service.TopicService;
import cn.tcmp.util.pageutil.PageUtil;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("topic")
public class TopicController {

    @Reference
    private TopicService topicService;
    @Reference
    private AnswerService answerService;
   //查询所有题目
    @RequestMapping("queryAllTopic")
    public String queryAll(Model model,Integer pageNo,Integer pageSize){
        if(pageNo==null){
            pageNo=1;
        }
        if(pageSize==null){
            pageSize=5;
        }
        PageUtil<Topic> pageUtil=topicService.queryAll(pageNo,pageSize);
        model.addAttribute("pageUtil",pageUtil);
        return "topic_list";
    }

   //查询这个题目下的所有答案
    @RequestMapping("queryAnswerById")
    public String queryAnswerById(Integer topicId,Model model){
        List<Answer> list=answerService.queryAnswer(topicId);
        Answer answer=answerService.queryRight(topicId);
        model.addAttribute("answer",answer);
        model.addAttribute("list",list);
        return "answer_list";
    }






}
