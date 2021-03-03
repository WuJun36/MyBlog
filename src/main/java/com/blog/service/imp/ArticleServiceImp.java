package com.blog.service.imp;


import com.blog.dao.ArticleCategoryRefMapper;
import com.blog.dao.ArticleMapper;
import com.blog.dao.ArticleTagRefMapper;
import com.blog.dao.UserMapper;
import com.blog.entity.Article;
import com.blog.entity.Category;
import com.blog.entity.Tag;
import com.blog.entity.User;
import com.blog.service.ArticleService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.log4j.Log4j;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author ：wujun
 * @date ：Created in 2020/11/17
 * @description：文章Service层
 */
@Service
public class ArticleServiceImp implements ArticleService {

    Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private ArticleMapper articleMapper;

    @Autowired
    private ArticleCategoryRefMapper articleCategoryRefMapper;

    @Autowired
    private ArticleTagRefMapper articleTagRefMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Article> getArticleList(Map<String, Object> constraint) {

        return articleMapper.getArticleList(constraint);
    }


    @Override
    public int countArticles() {
        return articleMapper.countArticle();
    }

    @Override
    public void insertArticle(Article article) {
        articleMapper.insertArticle(article);
    }

    @Override
    public void deleteArticleById(int id) {
        articleMapper.deleteArticleById(id);
    }

    @Override
    public void updateArticleById(Article article) {
        articleMapper.updateArticleById(article);
    }

    @Override
    public int countViews(int status) {
        return articleMapper.countViews(status);
    }

    @Override
    public Article getLastUpdateArticle() {
        return articleMapper.selectLastUpdateArticle();
    }

    @Override
    public Article getArticleById(int id) {
        Article article = articleMapper.getArticleById(id);
        if (article == null){
            logger.debug("id="+id+"的文章获取失败！");
        }
        // 文章所属类别
        List<Category> categoryList = articleCategoryRefMapper.getCategoryByArticleId(id);
        if (categoryList == null || categoryList.size() == 0){   //未分类
            categoryList.add(Category.Default());
        }
        article.setCategoryList(categoryList);
        // 文章所属标签
        List<Tag> tagList = articleTagRefMapper.getTagByArticleId(id);
        article.setTagList(tagList);
        // 文章作者信息
        User user = null;
        if(article.getArticleId() != null){
            System.out.println(userMapper);
            user = userMapper.selectUserById(article.getArticleAuthorId());
        }else {  //未找到作者信息
            user = User.Default();
        }

        article.setAuthor(user);

        return article ;
    }

    @Override
    public PageInfo<Article> pageArticle(Integer pageIndex, Integer pageSize, Map<String, Object> constraint) {
        //开始分页
        PageHelper.startPage(pageIndex, pageSize);
        //条件查询文章列表
        List<Article> articleList = articleMapper.getArticleList(constraint);
        for (int i = 0; i < articleList.size(); i++) {
            //TODO 封装每篇文章对应的分类（category)和标签(tag)
            //封装每篇文章对应的分类（category)
            List<Category> categoryList = articleCategoryRefMapper.getCategoryByArticleId(articleList.get(i).getArticleId());

            if (categoryList == null || categoryList.size() == 0){ //查询为空时默认文章未分类
                categoryList.add(Category.Default());
            }
            articleList.get(i).setCategoryList(categoryList);

            //封装每篇文章对应的标签（tag)
            List<Tag> tagList = articleTagRefMapper.getTagByArticleId(articleList.get(i).getArticleId());
            articleList.get(i).setTagList(tagList);
        }


        //用PageInfo对结果进行包装
        PageInfo<Article> pageInfo = new PageInfo<>(articleList);
        return pageInfo;

    }

    @Override
    public List<Article> getArticleListByCommentCount(Integer limit) {
        return articleMapper.getArticleListByCommentCount(limit);
    }

    @Override
    public List<Article> getArticleListByViewCount(Integer limit) {
        return articleMapper.getArticleListByViewCount(limit);
    }

    @Override
    public void likeArticle(Integer articleId,Integer increaseCount) {
        if (articleId == null){
            logger.error("ERROR:点赞ID为空");
            return;
        }
        int i = articleMapper.increaseLikeCountByArticleId(articleId, increaseCount,this.getArticleById(articleId).getArticleLikeCount());
        if (i <= 0){
            logger.error("ERROR:增加点赞数失败！");
        }
    }
}
