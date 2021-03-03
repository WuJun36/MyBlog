package com.blog.enums;

public enum Role {

    ADMIN(1,"管理员"),
    VISITOR(0,"普通用户");

    private int value;
    private String message;

    Role(int value, String message) {
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
