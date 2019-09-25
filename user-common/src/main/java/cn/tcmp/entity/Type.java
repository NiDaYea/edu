package cn.tcmp.entity;

import java.io.Serializable;


public class Type implements Serializable {
  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }

  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }

  public String getTypeCode() {
    return typeCode;
  }

  public void setTypeCode(String typeCode) {
    this.typeCode = typeCode;
  }

  public Integer getValueId() {
    return valueId;
  }

  public void setValueId(Integer valueId) {
    this.valueId = valueId;
  }

  public String getValueName() {
    return valueName;
  }

  public void setValueName(String valueName) {
    this.valueName = valueName;
  }

  private Integer typeId;
  private String typeName;
  private String typeCode;
  private Integer valueId;
  private String valueName;

  @Override
  public String toString() {
    return "Type{" +
            "typeId=" + typeId +
            ", typeName='" + typeName + '\'' +
            ", typeCode='" + typeCode + '\'' +
            ", valueId=" + valueId +
            ", valueName='" + valueName + '\'' +
            '}';
  }
}
