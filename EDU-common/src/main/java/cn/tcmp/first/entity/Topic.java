package cn.tcmp.first.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Topic implements Serializable {

  private Integer topicId;
  private String topicName;
  private String topicImg;
  private Integer topicCode;

}
