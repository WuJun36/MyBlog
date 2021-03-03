package com.blog.dao;

import com.blog.entity.Category;

import java.util.List;

public interface ArticleCategoryRefMapper {

    List<Category> getCategoryByArticleId(int articleId);
}
