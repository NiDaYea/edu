package cn.tcmp.first.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
  //用户状态
  private Integer userType;
}
