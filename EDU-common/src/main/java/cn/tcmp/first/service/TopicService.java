package cn.tcmp.first.service;

import cn.tcmp.first.entity.Topic;

import java.util.List;

public interface TopicService {

    //查询所有题目和答案
    List<Topic>  queryAllTopic(Integer topicCode);
}
