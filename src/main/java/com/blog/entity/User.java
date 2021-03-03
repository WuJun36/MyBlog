package com.blog.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ：wujun
 * @date ：Created in 2020/11/27
 * @description：
 */
public class User implements Serializable {

    private final static long serialVersionUID = -4415517704211731385L;

    private Integer userID;

    private String userName;

    private String password;

    private Date userRegistTime;

    private Date userLastLoginTime;

    private String userLastLoginIp;

    /**
     * 用户状态（0：无效；1：有效）
     */
    private Integer userStatus;

    public User() {
    }

    public User(Integer userID, String userName, String password) {
        this.userID = userID;
        this.userName = userName;
        this.password = password;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getUserRegistTime() {
        return userRegistTime;
    }

    public void setUserRegistTime(Date userRegistTime) {
        this.userRegistTime = userRegistTime;
    }

    public Date getUserLastLoginTime() {
        return userLastLoginTime;
    }

    public void setUserLastLoginTime(Date userLastLoginTime) {
        this.userLastLoginTime = userLastLoginTime;
    }

    public String getUserLastLoginIp() {
        return userLastLoginIp;
    }

    public void setUserLastLoginIp(String userLastLoginIp) {
        this.userLastLoginIp = userLastLoginIp;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public static User Default(){
        return new User(1000000,"未找到用户信息",null);
    }
}
