package cn.tcmp.first.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car implements Serializable {

  private Integer carId;
  private String carNum;
  private Integer carTypevalueId;
  private String carPrice;
  private String carDate;
  private String caroutDate;
  private Integer coathId;
  private Integer carvalueId;

}
