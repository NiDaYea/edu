package cn.tcmp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


public class Answer implements Serializable {

  private Integer answerId; // 主键
  private Integer answerCode;
  private String answerVal;
  private Integer topicId;
  private Topic topic;

  public Integer getAnswerId() {
    return answerId;
  }

  public void setAnswerId(Integer answerId) {
    this.answerId = answerId;
  }

  public Integer getAnswerCode() {
    return answerCode;
  }

  public void setAnswerCode(Integer answerCode) {
    this.answerCode = answerCode;
  }

  public String getAnswerVal() {
    return answerVal;
  }

  public void setAnswerVal(String answerVal) {
    this.answerVal = answerVal;
  }

  public Integer getTopicId() {
    return topicId;
  }

  public void setTopicId(Integer topicId) {
    this.topicId = topicId;
  }

  public Topic getTopic() {
    return topic;
  }

  public void setTopic(Topic topic) {
    this.topic = topic;
  }
}
