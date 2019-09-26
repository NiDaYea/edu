package cn.tcmp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


public class About implements Serializable {


  private Integer aboutId;
  private String aboutDate;
  private Integer coachId;
  private Integer userId;
  private String eight;
  private String twelve;
  private String fifteen;
  //后台约车外键表
  private Coach coach;
  private User user;


  public Coach getCoach() {
    return coach;
  }

  public void setCoach(Coach coach) {
    this.coach = coach;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Integer getAboutId() {
    return aboutId;
  }

  public void setAboutId(Integer aboutId) {
    this.aboutId = aboutId;
  }

  public String getAboutDate() {
    return aboutDate;
  }

  public void setAboutDate(String aboutDate) {
    this.aboutDate = aboutDate;
  }

  public Integer getCoachId() {
    return coachId;
  }

  public void setCoachId(Integer coachId) {
    this.coachId = coachId;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getEight() {
    return eight;
  }

  public void setEight(String eight) {
    this.eight = eight;
  }

  public String getTwelve() {
    return twelve;
  }

  public void setTwelve(String twelve) {
    this.twelve = twelve;
  }

  public String getFifteen() {
    return fifteen;
  }

  public void setFifteen(String fifteen) {
    this.fifteen = fifteen;
  }
}
