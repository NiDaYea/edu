package cn.tcmp.first.dao;

import cn.tcmp.first.entity.Topic;
import org.springframework.data.domain.Page;

import java.util.List;

public interface TopicMapper {

    //查询所有题目和答案
    List<Topic> queryAllTopic(Integer topicCode);

    //100条题目和对应答案
    List<Topic> queryByYIbai(Integer topicCode);
}
