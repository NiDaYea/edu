package cn.tcmp.first.service;

import cn.tcmp.first.entity.Answer;
import cn.tcmp.first.entity.Topic;

import java.util.List;

public interface TopicService {

    //查询100到题目
    List<Topic> queryByYIbai(Integer topicCode);

    //根据题目id查询答案
    List<Answer> queryAnswer(Integer topicId);

}
