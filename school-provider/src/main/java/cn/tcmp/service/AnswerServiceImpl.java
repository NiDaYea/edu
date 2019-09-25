package cn.tcmp.service;

import cn.tcmp.dao.AnswerMapper;
import cn.tcmp.entity.Answer;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class AnswerServiceImpl implements AnswerService {
    @Autowired
    private AnswerMapper answerMapper;
    @Override
    public List<Answer> queryAnswer(Integer topicId) {
        return answerMapper.queryAll(topicId);
    }

    @Override
    public Answer queryRight(Integer topicId) {
        return answerMapper.queryRight(topicId);
    }
}
