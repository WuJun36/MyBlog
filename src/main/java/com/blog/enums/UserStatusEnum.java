package com.blog.enums;

public enum UserStatusEnum {

    VALID(1,"有效账号"),
    INVALID(0,"账号已注销");
    private Integer value;
    private String message;

    UserStatusEnum(Integer value, String message) {
        this.value = value;
        this.message = message;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
