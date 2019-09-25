package cn.tcmp.service;

import cn.tcmp.entity.Answer;

import java.util.List;

public interface AnswerService {
    //查询这个题目下的答案
    List<Answer> queryAnswer(Integer topicId);
    //查询这个题目下的正确答案
    Answer queryRight(Integer topicId);

}
