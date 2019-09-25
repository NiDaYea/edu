package cn.tcmp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;


public class Topic implements Serializable {

  private Integer topicId;
  private String topicName;
  private String topicImg;
  private Integer topicCode;

  //答案表
  private List<Answer> listanswer;

  public Integer getTopicId() {
    return topicId;
  }

  public void setTopicId(Integer topicId) {
    this.topicId = topicId;
  }

  public String getTopicName() {
    return topicName;
  }

  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }

  public String getTopicImg() {
    return topicImg;
  }

  public void setTopicImg(String topicImg) {
    this.topicImg = topicImg;
  }

  public Integer getTopicCode() {
    return topicCode;
  }

  public void setTopicCode(Integer topicCode) {
    this.topicCode = topicCode;
  }

  public List<Answer> getListanswer() {
    return listanswer;
  }

  public void setListanswer(List<Answer> listanswer) {
    this.listanswer = listanswer;
  }
}
