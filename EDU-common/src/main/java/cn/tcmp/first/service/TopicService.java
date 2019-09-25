package cn.tcmp.first.service;

import cn.tcmp.first.entity.Answer;
import cn.tcmp.first.entity.Topic;

import java.util.List;

public interface TopicService {

    //查询100到题目
    List<Topic> queryByYIbai(Integer topicCode);

    //根据题目id查询答案
    List<Answer> queryAnswer(Integer topicId);

    //顺序练习  查所有题和对应答案 条件科几
    List<Topic> queryAll(Integer topicCode);


}
