package cn.tcmp.first.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Score implements Serializable {

  private Integer scoreId;
  private Integer score;
  private Integer scorevalueId;
  private Integer userId;

}
