package cn.tcmp.first.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class About implements Serializable {

  private Integer aboutId;//我是张永赐 我是沙雕 提交来自demo8888  请大家即使更新
  private String aboutDate;
  private String aboutTime;
  private Integer coachId;
  private Integer userId;

}
