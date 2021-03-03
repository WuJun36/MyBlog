package com.blog.entity;

import java.io.Serializable;

/**
 * @author ：wujun
 * @date ：Created in 2020/11/24
 * @description：文章-分类关系对应表实体
 */
public class ArticleCategoryRef implements Serializable {
    private final static long serialVersionUID = -6809206515467725995L;

    /**
     * 文章ID
     */
    private int articleId;

    /**
     * 文章所属分类ID
     */
    private int categoryId;

    public ArticleCategoryRef() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
