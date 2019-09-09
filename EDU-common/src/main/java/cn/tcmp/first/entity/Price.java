package cn.tcmp.first.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Price implements Serializable {

  private Integer priceId;
  private String price;
  private String priceDate;
  private Integer pricevalueId;
  private Integer userId;


}
