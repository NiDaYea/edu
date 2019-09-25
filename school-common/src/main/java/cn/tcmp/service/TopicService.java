package cn.tcmp.service;

import cn.tcmp.entity.Topic;
import cn.tcmp.util.pageutil.PageUtil;

import java.util.List;

public interface TopicService {
    //查询所有题目
    PageUtil<Topic> queryAll(Integer pageNo,Integer pageSize);



}
