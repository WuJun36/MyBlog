package com.blog.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author ：wujun
 * @date ：Created in 2020/11/16
 * @description：文章实体
 */
public class Article implements Serializable {

    private static final long serialVersionUID = 5207865247400761539L;

    /**
     * 文章id
     */
    private Integer articleId;

    /**
     * 文章标题
     */
    private String articleTitle;

    /**
     * 文章内容
     */
    private String articleContent;

    /**
     * 作者ID
     */
    private Integer articleAuthorId;

    /**
     * 文章评论数
     */
    private Integer articleCommentCount;

    /**
     * 文章浏览数
     */
    private Integer articleViewCount;

    /**
     * 文章点赞数
     */
    private Integer articleLikeCount;

    /**
     * 文章创建时间
     */
    private Date articleCreateTime;

    /**
     * 文章更新时间
     */
    private Date articleUpdateTime;

    /**
     * 文章状态（1：有效；0：无效）
     */
    private Integer articleStatus;

    //以下非数据库字段

    /**
     * 文章所属分类ID（可多个）
     */
    private List<Category> categoryList;

    /**
     * 文章标签ID（多个）
     */
    private List<Tag> tagList;

    /**
     * 作者信息
     */
    private User author;



    public Article() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public Integer getArticleAuthorId() {
        return articleAuthorId;
    }

    public void setArticleAuthorId(Integer articleAuthorId) {
        this.articleAuthorId = articleAuthorId;
    }

    public Integer getArticleCommentCount() {
        return articleCommentCount;
    }

    public void setArticleCommentCount(Integer articleCommentCount) {
        this.articleCommentCount = articleCommentCount;
    }

    public Integer getArticleViewCount() {
        return articleViewCount;
    }

    public void setArticleViewCount(Integer articleViewCount) {
        this.articleViewCount = articleViewCount;
    }

    public Date getArticleCreateTime() {
        return articleCreateTime;
    }

    public void setArticleCreateTime(Date articleCreateTime) {
        this.articleCreateTime = articleCreateTime;
    }

    public Date getArticleUpdateTime() {
        return articleUpdateTime;
    }

    public void setArticleUpdateTime(Date articleUpdateTime) {
        this.articleUpdateTime = articleUpdateTime;
    }

    public Integer getArticleStatus() {
        return articleStatus;
    }

    public void setArticleStatus(Integer articleStatus) {
        this.articleStatus = articleStatus;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public List<Tag> getTagList() {
        return tagList;
    }

    public void setTagList(List<Tag> tagList) {
        this.tagList = tagList;
    }

    @Override
    public String toString() {
        return "Article{" +
                "articleId=" + articleId +
                ", articleTitle='" + articleTitle + '\'' +
                ", articleContent='" + articleContent + '\'' +
                ", articleAuthorId=" + articleAuthorId +
                ", articleCommentCount=" + articleCommentCount +
                ", articleViewCount=" + articleViewCount +
                ", articleCreateTime=" + articleCreateTime +
                ", articleUpdateTime=" + articleUpdateTime +
                ", articleStatus=" + articleStatus +
                '}';
    }

    public Integer getArticleLikeCount() {
        return articleLikeCount;
    }

    public void setArticleLikeCount(Integer articleLikeCount) {
        this.articleLikeCount = articleLikeCount;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
