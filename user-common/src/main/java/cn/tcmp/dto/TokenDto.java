package cn.tcmp.dto;


import java.io.Serializable;

public class TokenDto implements Serializable {

    private DataDto data;

    private String errorCode;

    private DataDto dataDto;

    public DataDto getDataDto() {
        return dataDto;
    }

    public void setDataDto(DataDto dataDto) {
        this.dataDto = dataDto;
    }

    public DataDto getData() {
        return data;
    }

    public void setData(DataDto data) {
        this.data = data;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
