package cn.tcmp.first.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Answer implements Serializable {

  private Integer answerId; // 主键
  private Integer answerCode;
  private String answerVal;
  private Integer topicId;


}
