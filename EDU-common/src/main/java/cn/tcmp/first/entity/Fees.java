package cn.tcmp.first.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fees implements Serializable {

  private Integer feesid;
  private String classType;
  private String carType;
  private String license;
  private Integer price;
  private String explain;




}
