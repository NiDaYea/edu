package cn.tcmp.dao;

import cn.tcmp.entity.Topic;

import java.util.List;

public interface TopicMapper {
    //查询所有题目
    List<Topic> queryAll();
}
