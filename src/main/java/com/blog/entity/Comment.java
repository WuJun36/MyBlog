package com.blog.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ：wujun
 * @date ：Created in 2020/11/20
 * @description：评论实体类
 */
public class Comment implements Serializable {

    private static final Long serialVersionUID = -1038897351672911219L;

    /**
     * 评论ID
     */
    private Integer commentId;

    /**
     * 评论主楼ID
     */
    private Integer commentPId;

    /**
     * 评论主楼用户名
     */
    private String commentPName;

    /**
     * 评论文章ID
     */
    private Integer commentArticleId;

    /**
     * 评论用户名
     */
    private String commentAuthorName;

    /**
     * 评论用户邮箱
     */
    private String commentAuthorEmail;

    /**
     * 评论用户地址
     */
    private String commentAuthorUrl;

    /**
     * 评论内容
     */
    private String commentContent;

    /**
     * 提交评论设备IP地址
     */
    private String commentIp;

    /**
     * 评论创建时间
     */
    private Date commentCreateTime;

    /**
     * 评论者角色 0：普通用户，1：管理者
     */
    private Integer commentRole;

    public Comment() {
    }

    public static Long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getCommentPId() {
        return commentPId;
    }

    public void setCommentPId(Integer commentPId) {
        this.commentPId = commentPId;
    }

    public String getCommentPName() {
        return commentPName;
    }

    public void setCommentPName(String commentPName) {
        this.commentPName = commentPName;
    }

    public Integer getCommentArticleId() {
        return commentArticleId;
    }

    public void setCommentArticleId(Integer commentArticleId) {
        this.commentArticleId = commentArticleId;
    }

    public String getCommentAuthorName() {
        return commentAuthorName;
    }

    public void setCommentAuthorName(String commentAuthorName) {
        this.commentAuthorName = commentAuthorName;
    }

    public String getCommentAuthorEmail() {
        return commentAuthorEmail;
    }

    public void setCommentAuthorEmail(String commentAuthorEmail) {
        this.commentAuthorEmail = commentAuthorEmail;
    }

    public String getCommentAuthorUrl() {
        return commentAuthorUrl;
    }

    public void setCommentAuthorUrl(String commentAuthorUrl) {
        this.commentAuthorUrl = commentAuthorUrl;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getCommentIp() {
        return commentIp;
    }

    public void setCommentIp(String commentIp) {
        this.commentIp = commentIp;
    }

    public Date getCommentCreateTime() {
        return commentCreateTime;
    }

    public void setCommentCreateTime(Date commentCreateTime) {
        this.commentCreateTime = commentCreateTime;
    }

    public Integer getCommentRole() {
        return commentRole;
    }

    public void setCommentRole(Integer commentRole) {
        this.commentRole = commentRole;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", commentPId=" + commentPId +
                ", commentPName='" + commentPName + '\'' +
                ", commentArticleId=" + commentArticleId +
                ", commentAuthorName='" + commentAuthorName + '\'' +
                ", commentAuthorEmail='" + commentAuthorEmail + '\'' +
                ", commentAuthorUrl='" + commentAuthorUrl + '\'' +
                ", commentContent='" + commentContent + '\'' +
                ", commentIp='" + commentIp + '\'' +
                ", commentCreateTime=" + commentCreateTime +
                ", commentRole=" + commentRole +
                '}';
    }
}




