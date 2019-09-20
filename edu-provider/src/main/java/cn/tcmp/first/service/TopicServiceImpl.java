package cn.tcmp.first.service;

import cn.tcmp.first.dao.TopicMapper;
import cn.tcmp.first.entity.Answer;
import cn.tcmp.first.entity.Topic;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class TopicServiceImpl implements TopicService {

    @Autowired
    private TopicMapper topicMapper;

    @Override
    public List<Topic> queryByYIbai(Integer topicCode) {
        return topicMapper.queryByYIbai(topicCode);
    }

    @Override
    public List<Answer> queryAnswer(Integer topicId) {
        return topicMapper.queryAnswer(topicId);
    }
}
