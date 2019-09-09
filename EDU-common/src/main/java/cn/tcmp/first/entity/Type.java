package cn.tcmp.first.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Type implements Serializable {

  private Integer typeId;
  private String typeName;
  private String typeCode;
  private Integer valueId;
  private String valueName;

}
