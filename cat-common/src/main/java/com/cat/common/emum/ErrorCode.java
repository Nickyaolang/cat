package com.cat.common.emum;


public enum ErrorCode {

    SUCCESS("200", "成功"),
    FAIL("400", "失败"),
    ERROR("500", "inservice error");


    private String code;

    private String description;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    ErrorCode(String code, String description) {
        this.code = code;
        this.description = description;
    }
}
