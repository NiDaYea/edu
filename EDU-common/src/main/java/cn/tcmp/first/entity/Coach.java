package cn.tcmp.first.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


public class Coach implements Serializable {
    public Integer getCoachId() {
        return coachId;
    }

    public void setCoachId(Integer coachId) {
        this.coachId = coachId;
    }

    public String getCoathSex() {
        return coathSex;
    }

    public void setCoathSex(String coathSex) {
        this.coathSex = coathSex;
    }

    public String getCoathAge() {
        return coathAge;
    }

    public void setCoathAge(String coathAge) {
        this.coathAge = coathAge;
    }

    public String getCoathName() {
        return coathName;
    }

    public void setCoathName(String coathName) {
        this.coathName = coathName;
    }

    public String getCoathNum() {
        return coathNum;
    }

    public void setCoathNum(String coathNum) {
        this.coathNum = coathNum;
    }

    public Integer getCoathStatevalueId() {
        return coathStatevalueId;
    }

    public void setCoathStatevalueId(Integer coathStatevalueId) {
        this.coathStatevalueId = coathStatevalueId;
    }

    public String getCoathDate() {
        return coathDate;
    }

    public void setCoathDate(String coathDate) {
        this.coathDate = coathDate;
    }

    public Integer getCoathvalueId() {
        return coathvalueId;
    }

    public void setCoathvalueId(Integer coathvalueId) {
        this.coathvalueId = coathvalueId;
    }

    public Integer getCoathGradevalueId() {
        return coathGradevalueId;
    }

    public void setCoathGradevalueId(Integer coathGradevalueId) {
        this.coathGradevalueId = coathGradevalueId;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getCoachtel() {
        return coachtel;
    }

    public void setCoachtel(String coachtel) {
        this.coachtel = coachtel;
    }

    public String getCoachpass() {
        return coachpass;
    }

    public void setCoachpass(String coachpass) {
        this.coachpass = coachpass;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    private Integer coachId;
  private String coathSex;
  private String coathAge;
  private String coathName;
  private String coathNum;
  private Integer coathStatevalueId;
  private String coathDate;
  private Integer coathvalueId;
  private Integer coathGradevalueId;
  private Integer carId;

  //教练的登陆账号呵呵密码
  private String coachtel;
  private String coachpass;
  private Type type;
  private Car car;

}
