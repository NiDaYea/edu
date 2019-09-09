package cn.tcmp.first.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class About implements Serializable {

  private Integer aboutId;//shs
  private String aboutDate;//跟胡
  private String aboutTime;//杀杀杀
  private Integer coachId;
  private Integer userId;

}
