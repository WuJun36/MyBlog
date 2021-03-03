package com.blog.entity;

import java.io.Serializable;

/**
 * @author ：wujun
 * @date ：Created in 2020/11/18
 * @description：网站基础信息实体
 */
public class Options implements Serializable {

    private static final Long serialVersionUID = 776792869602511933L;

    private int optionId;

    /**
     * 网站title
     */
    private String optionSiteTitle;

    /**
     * 网站描述
     */
    private String optionSiteDescription;

    private String optionMetaDescription;

    private String optionMetaKeyword;

    private  String optionAboutsiteAvatar;

    /**
     * 关于本站标题
     */
    private String optionAboutsiteTitle;

    /**
     * 关于本站内容
     */
    private String optionAboutsiteContent;

    /**
     * 关于本站微信链接
     */
    private String optionAboutsiteWechat;

    /**
     * 关于本站QQ链接
     */
    private String optionAboutsiteQQ;

    /**
     * 关于本站github链接
     */
    private String optionAboutsiteGithub;

    /**
     * 关于本站微博链接
     */
    private String optionAboutsiteWeibo;

    private String optionTongji;

    /**
     * 本条基础信息状态(0:有效，1:无效)
     */
    private int optionStatus;

    public Options() {
    }

    public static Long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getOptionId() {
        return optionId;
    }

    public void setOptionId(int optionId) {
        this.optionId = optionId;
    }

    public String getOptionSiteTitle() {
        return optionSiteTitle;
    }

    public void setOptionSiteTitle(String optionSiteTitle) {
        this.optionSiteTitle = optionSiteTitle;
    }

    public String getOptionSiteDescription() {
        return optionSiteDescription;
    }

    public void setOptionSiteDescription(String optionSiteDescription) {
        this.optionSiteDescription = optionSiteDescription;
    }

    public String getOptionMetaDescription() {
        return optionMetaDescription;
    }

    public void setOptionMetaDescription(String optionMetaDescription) {
        this.optionMetaDescription = optionMetaDescription;
    }

    public String getOptionMetaKeyword() {
        return optionMetaKeyword;
    }

    public void setOptionMetaKeyword(String optionMetaKeyword) {
        this.optionMetaKeyword = optionMetaKeyword;
    }

    public String getOptionAboutsiteTitle() {
        return optionAboutsiteTitle;
    }

    public void setOptionAboutsiteTitle(String optionAboutsiteTitle) {
        this.optionAboutsiteTitle = optionAboutsiteTitle;
    }

    public String getOptionAboutsiteContent() {
        return optionAboutsiteContent;
    }

    public void setOptionAboutsiteContent(String optionAboutsiteContent) {
        this.optionAboutsiteContent = optionAboutsiteContent;
    }

    public String getOptionAboutsiteWechat() {
        return optionAboutsiteWechat;
    }

    public void setOptionAboutsiteWechat(String optionAboutsiteWechat) {
        this.optionAboutsiteWechat = optionAboutsiteWechat;
    }

    public String getOptionAboutsiteQQ() {
        return optionAboutsiteQQ;
    }

    public void setOptionAboutsiteQQ(String optionAboutsiteQQ) {
        this.optionAboutsiteQQ = optionAboutsiteQQ;
    }

    public String getOptionAboutsiteGithub() {
        return optionAboutsiteGithub;
    }

    public void setOptionAboutsiteGithub(String optionAboutsiteGithub) {
        this.optionAboutsiteGithub = optionAboutsiteGithub;
    }

    public String getOptionAboutsiteWeibo() {
        return optionAboutsiteWeibo;
    }

    public void setOptionAboutsiteWeibo(String optionAboutsiteWeibo) {
        this.optionAboutsiteWeibo = optionAboutsiteWeibo;
    }

    public String getOptionTongji() {
        return optionTongji;
    }

    public void setOptionTongji(String optionTongji) {
        this.optionTongji = optionTongji;
    }

    public int getOptionStatus() {
        return optionStatus;
    }

    public void setOptionStatus(int optionStatus) {
        this.optionStatus = optionStatus;
    }

    @Override
    public String toString() {
        return "Options{" +
                "optionId=" + optionId +
                ", optionSiteTitle='" + optionSiteTitle + '\'' +
                ", optionSiteDescription='" + optionSiteDescription + '\'' +
                ", optionMetaDescription='" + optionMetaDescription + '\'' +
                ", optionMetaKeyword='" + optionMetaKeyword + '\'' +
                ", optionAboutsiteTitle='" + optionAboutsiteTitle + '\'' +
                ", optionAboutsiteContent='" + optionAboutsiteContent + '\'' +
                ", optionAboutsiteWechat='" + optionAboutsiteWechat + '\'' +
                ", optionAboutsiteQQ='" + optionAboutsiteQQ + '\'' +
                ", optionAboutsiteGithub='" + optionAboutsiteGithub + '\'' +
                ", optionAboutsiteWeibo='" + optionAboutsiteWeibo + '\'' +
                ", optionTongji='" + optionTongji + '\'' +
                ", optionStatus=" + optionStatus +
                '}';
    }

    public String getOptionAboutsiteAvatar() {
        return optionAboutsiteAvatar;
    }

    public void setOptionAboutsiteAvatar(String optionAboutsiteAvatar) {
        this.optionAboutsiteAvatar = optionAboutsiteAvatar;
    }
}
