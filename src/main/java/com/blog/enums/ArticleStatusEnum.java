package com.blog.enums;

public enum ArticleStatusEnum {

    PUBLISH(1,"已发布"),
    DRAFT(2,"草稿");

    private int value;
    private String message;

    ArticleStatusEnum(int value, String message) {
        this.value = value;
        this.message = message;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
