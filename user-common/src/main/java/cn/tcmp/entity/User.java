package cn.tcmp.entity;


import java.io.Serializable;

public class User implements Serializable {

  private Integer userId;
  private String userName;
  private Integer userJingDu;

  public Integer getUserJingDu() {
    return userJingDu;
  }

  public void setUserJingDu(Integer userJingDu) {
    this.userJingDu = userJingDu;
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

  public String getUserNum() {
    return userNum;
  }

  public void setUserNum(String userNum) {
    this.userNum = userNum;
  }

  public String getUserTel() {
    return userTel;
  }

  public void setUserTel(String userTel) {
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

  private Integer userAge;
  private String userSex;
  private String userNum;
  private String userTel;
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
}
