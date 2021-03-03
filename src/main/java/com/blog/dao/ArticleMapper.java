package com.blog.dao;

import com.blog.entity.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

//@Mapper
public interface ArticleMapper {

    /**
     * 条件查询文章列表
     * @param constraint 查询条件
     * @return 文章列表
     */
    List<Article> getArticleList(Map<String,Object> constraint);

    /**
     * 插入行数
     * @param article 文章对象
     * @return 影响行数
     */
    int insertArticle(Article article);

    /**
     * 根据文章ID删除文章
     * @param id 文章ID
     * @return 影响行数
     */
    int deleteArticleById(int id);

    /**
     * 根据文章ID更新文章数据
     * @param article 文章对象
     * @return 影响行数
     */
    int updateArticleById(Article article);

    /**
     * 计算文章总数
     * @return 文章总数
     */
    int countArticle();

    /**
     * 查询全部文章的浏览数量（不包括草稿状态的文章）
     * @return 浏览总数
     */
    int countViews(int status);

    /**
     * 查询最后更新的文章，并返回
     * @return 最后更新的文章
     */
    Article selectLastUpdateArticle();

    /**
     * 根据文章id获取文章详情
     * @param id 文章id
     * @return
     */
    Article getArticleById(int id);

    /**
     * 根据评论数量对文章进行排序，取评论数前limit位的文章列表
     * @param limit 前多少位
     * @return 文章列表（已发布）
     */
    List<Article> getArticleListByCommentCount(int limit);

    /**
     * 根据浏览数量对文章进行排序，取浏览数前limit位的文章列表
     * @param limit 前多少位
     * @return 文章列表
     */
    List<Article> getArticleListByViewCount(Integer limit);

    /**
     * 根据文章ID，增加increaseCount个点赞数
     * @param articleId
     * @return 影响行数
     */
    int increaseLikeCountByArticleId(Integer articleId,int increaseCount,int articleLikeCount);
}
