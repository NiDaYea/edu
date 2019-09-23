package cn.tcmp.first.service;

import cn.tcmp.first.entity.Topic;
import cn.tcmp.first.entity.Wrong;

import java.util.List;

public interface WrongService {

    //添加错题
    Integer saveWrong(Wrong wrong);

    //根据用户id和题目id删除错题
    Integer delWrong(Wrong wrong);

    //根据用户id查询所有错题
    List<Topic> queryAll(Integer userId,Integer topicCode);
}
