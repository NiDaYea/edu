package cn.tcmp.first.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Topic implements Serializable {

  private Integer topicId;
  private String topicName;
  private String topicImg;
  private Integer topicCode;

  //答案表
  private List<Answer> listanswer;
}
