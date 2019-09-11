package cn.tcmp.first.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coach implements Serializable {

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


}
