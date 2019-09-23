package cn.tcmp.entity;

import java.io.Serializable;


public class Car implements Serializable {
  
  public Integer getCarId() {
    return carId;
  }

  public void setCarId(Integer carId) {
    this.carId = carId;
  }

  public String getCarNum() {
    return carNum;
  }

  public void setCarNum(String carNum) {
    this.carNum = carNum;
  }

  public Integer getCarTypevalueId() {
    return carTypevalueId;
  }

  public void setCarTypevalueId(Integer carTypevalueId) {
    this.carTypevalueId = carTypevalueId;
  }

  public String getCarPrice() {
    return carPrice;
  }

  public void setCarPrice(String carPrice) {
    this.carPrice = carPrice;
  }

  public String getCarDate() {
    return carDate;
  }

  public void setCarDate(String carDate) {
    this.carDate = carDate;
  }

  public String getCaroutDate() {
    return caroutDate;
  }

  public void setCaroutDate(String caroutDate) {
    this.caroutDate = caroutDate;
  }

  public Integer getCoachId() {
    return coachId;
  }

  public void setCoachId(Integer coachId) {
    this.coachId = coachId;
  }

  public Integer getCarvalueId() {
    return carvalueId;
  }

  public void setCarvalueId(Integer carvalueId) {
    this.carvalueId = carvalueId;
  }

  private Integer carId;
  private String carNum;
  private Integer carTypevalueId;
  private String carPrice;
  private String carDate;
  private String caroutDate;
  private Integer coachId;
  private Integer carvalueId;
  private Type type1;
  private Type type2;
  private Coach coach;

  public Coach getCoach() {
    return coach;
  }

  public void setCoach(Coach coach) {
    this.coach = coach;
  }

  public Type getType1() {
    return type1;
  }

  public void setType1(Type type1) {
    this.type1 = type1;
  }

  public Type getType2() {
    return type2;
  }

  public void setType2(Type type2) {
    this.type2 = type2;
  }

  @Override
  public String toString() {
    return "Car{" +
            "carId=" + carId +
            ", carNum='" + carNum + '\'' +
            ", carTypevalueId=" + carTypevalueId +
            ", carPrice='" + carPrice + '\'' +
            ", carDate='" + carDate + '\'' +
            ", caroutDate='" + caroutDate + '\'' +
            ", coachId=" + coachId +
            ", carvalueId=" + carvalueId +
            '}';
  }
}
