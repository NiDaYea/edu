package cn.tcmp.first.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class About implements Serializable {


  private Integer aboutId;
  private String aboutDate;
  private Integer coachId;
  private Integer userId;
  private String eight;
  private String twelve;
  private String fifteen;

}
