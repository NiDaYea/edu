package cn.tcmp.dao;

import cn.tcmp.entity.Answer;

import java.util.List;

public interface AnswerMapper {
    //查询这个题目下的所有答案
    List<Answer> queryAll(Integer topicId);
    //查询这个题目下的正确答案
    Answer queryRight(Integer topicId);



}
