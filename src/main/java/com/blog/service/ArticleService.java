package com.blog.service;

import com.blog.entity.Article;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface ArticleService {

    /**
     * 条件查询文章列表
     * @param constraint 查询条件
     * @return 文章列表
     */
   List<Article> getArticleList(Map<String,Object> constraint);

    /**
     * 计算所有的文章数量
     * @return 文章数量
     */
   int countArticles();

    /**
     * 新增文章
     * @param article 文章对象
     */
   void insertArticle(Article article);

    /**
     * 根据ID删除文章
     * @param id
     */
   void deleteArticleById(int id);

    /**
     * 根据ID更新文章
     * @param article
     */
   void updateArticleById(Article article);

    /**
     * 根据文章状态查询其浏览总数(不包括草稿状态）
     * @return 浏览总数
     */
    int countViews(int status);

    /**
     * 获取最后更新的文章
     * @return 最后更新的文章
     */
    Article getLastUpdateArticle();

    /**
     * 根据文章ID获取文章详情
     * @param id 文章ID
     * @return
     */
    Article getArticleById(int id);

    /**
     * 获取文章分页信息
     * @param pageIndex  当前页码
     * @param pageSize  每页大小
     * @param constraint  查询条件
     * @return   分页对象
     */
    PageInfo<Article> pageArticle(Integer pageIndex, Integer pageSize, Map<String,Object> constraint);

    /**
     * 根据评论数量对文章进行排序，取评论数前limit位的文章列表
     * @param limit 前多少位
     * @return 文章列表
     */
    List<Article> getArticleListByCommentCount(Integer limit);

    /**
     * 根据浏览数量对文章进行排序，取浏览数前limit位的文章列表
     * @param limit 前多少位
     * @return 文章列表
     */
    List<Article> getArticleListByViewCount(Integer limit);

    /**
     * 对文章点赞
     * @param articleId 文章ID
     */
    void likeArticle(Integer articleId,Integer increaseCount);
}
