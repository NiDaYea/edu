package cn.tcmp.first.service;

import cn.tcmp.first.entity.Topic;
import cn.tcmp.first.util.PageUtil;

import java.util.List;

public interface TopicService {

    //查询所有题目和答案
    PageUtil<Topic> queryAllTopic(Integer topicCode,Integer pageNo, Integer pageSize);

    //100条题目和对应答案
    List<Topic> queryByYIbai(Integer topicCode);
}
