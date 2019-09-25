package cn.tcmp.first.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

  public Integer getCoathId() {
    return coathId;
  }

  public void setCoathId(Integer coathId) {
    this.coathId = coathId;
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
  private Integer coathId;
  private Integer carvalueId;

}
