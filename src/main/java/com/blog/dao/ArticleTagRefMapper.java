package com.blog.dao;

import com.blog.entity.Tag;

import java.util.List;

public interface ArticleTagRefMapper {

    /**
     * 根据文章ID查询
     * @param articleId
     * @return
     */
    List<Tag> getTagByArticleId(int articleId);
}
