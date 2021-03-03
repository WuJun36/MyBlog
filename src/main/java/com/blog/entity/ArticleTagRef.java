package com.blog.entity;

import java.io.Serializable;

/**
 * @author ：wujun
 * @date ：Created in 2020/11/24
 * @description：文章-标签关系对应表实体类
 */
public class ArticleTagRef implements Serializable {

    private final static long serialVersionUID = 5816783232020910492L;

    private Integer articleId;

    private Integer tagId;

    public ArticleTagRef() {
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

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }
}
