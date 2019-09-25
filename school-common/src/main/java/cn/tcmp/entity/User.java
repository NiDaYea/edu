package cn.tcmp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


public class User implements Serializable {

  private Integer userId;
  private String userName;
  private Integer userAge;
  private String userSex;
  private Integer userNum;
  private Integer userTel;
  private String userDate;
  private String userAddress;
  private String userCountry;
  private String userPassword;
  private Integer uservaluecarId;
  private String userSuDate;
  private Integer uservalueId;
  private Integer userroles;

  public Integer getUserroles() {
    return userroles;
  }

  public void setUserroles(Integer userroles) {
    this.userroles = userroles;
  }

  //用户状态
  private Integer userType;
  private Integer userJingDu;

  public Integer getUserJingDu() {
    return userJingDu;
  }

  public void setUserJingDu(Integer userJingDu) {
    this.userJingDu = userJingDu;
  }

  private Type type;
  private Type type2;
  private Fees fees;

  public Fees getFees() {
    return fees;
  }

  public void setFees(Fees fees) {
    this.fees = fees;
  }

  public Type getType2() {
    return type2;
  }

  public void setType2(Type type2) {
    this.type2 = type2;
  }

  public Type getType() {
    return type;
  }

  public void setType(Type type) {
    this.type = type;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public Integer getUserAge() {
    return userAge;
  }

  public void setUserAge(Integer userAge) {
    this.userAge = userAge;
  }

  public String getUserSex() {
    return userSex;
  }

  public void setUserSex(String userSex) {
    this.userSex = userSex;
  }

  public Integer getUserNum() {
    return userNum;
  }

  public void setUserNum(Integer userNum) {
    this.userNum = userNum;
  }

  public Integer getUserTel() {
    return userTel;
  }

  public void setUserTel(Integer userTel) {
    this.userTel = userTel;
  }

  public String getUserDate() {
    return userDate;
  }

  public void setUserDate(String userDate) {
    this.userDate = userDate;
  }

  public String getUserAddress() {
    return userAddress;
  }

  public void setUserAddress(String userAddress) {
    this.userAddress = userAddress;
  }

  public String getUserCountry() {
    return userCountry;
  }

  public void setUserCountry(String userCountry) {
    this.userCountry = userCountry;
  }

  public String getUserPassword() {
    return userPassword;
  }

  public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
  }

  public Integer getUservaluecarId() {
    return uservaluecarId;
  }

  public void setUservaluecarId(Integer uservaluecarId) {
    this.uservaluecarId = uservaluecarId;
  }

  public String getUserSuDate() {
    return userSuDate;
  }

  public void setUserSuDate(String userSuDate) {
    this.userSuDate = userSuDate;
  }

  public Integer getUservalueId() {
    return uservalueId;
  }

  public void setUservalueId(Integer uservalueId) {
    this.uservalueId = uservalueId;
  }

  public Integer getUserType() {
    return userType;
  }

  public void setUserType(Integer userType) {
    this.userType = userType;
  }

  @Override
  public String toString() {
    return "User{" +
            "userId=" + userId +
            ", userName='" + userName + '\'' +
            ", userAge=" + userAge +
            ", userSex='" + userSex + '\'' +
            ", userNum=" + userNum +
            ", userTel=" + userTel +
            ", userDate='" + userDate + '\'' +
            ", userAddress='" + userAddress + '\'' +
            ", userCountry='" + userCountry + '\'' +
            ", userPassword='" + userPassword + '\'' +
            ", uservaluecarId=" + uservaluecarId +
            ", userSuDate='" + userSuDate + '\'' +
            ", uservalueId=" + uservalueId +
            ", userType=" + userType +
            ", userJingDu=" + userJingDu +
            ", type=" + type +
            '}';
  }
}
