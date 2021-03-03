package com.blog.test;

import com.blog.entity.Article;
import com.blog.service.ArticleService;
import com.blog.service.imp.ArticleServiceImp;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArticleServiceImpTest {

    ApplicationContext ioc = new ClassPathXmlApplicationContext("spring/spring-mybatis.xml");
    ArticleService service = ioc.getBean(ArticleService.class);

//    @Test
//    void getAllArticle() {
//
//        List<Article> allArticle = service.getAllArticle();
//        if (allArticle != null){
//            allArticle.forEach(System.out::println);
//        }
//    }

    @Test
    void countArticles(){
        System.out.println(service.countArticles());
    }

    @Test
    void insertArticle(){
        Article article = new Article();
        article.setArticleTitle("测试insert方法");
        article.setArticleContent("测试insert方法，正文内容");
        article.setArticleStatus(1); //有效
        article.setArticleCreateTime(new Date());
        article.setArticleUpdateTime(new Date());
        service.insertArticle(article);
    }

    @Test
    void deleteArticleById(){
        service.deleteArticleById(2);
    }

    @Test
   void updateArticleById(){
        Article article = new Article();
        article.setArticleId(3);
        article.setArticleContent("测试更新---1118");
        System.out.println(article);
        service.updateArticleById(article);
   }

   @Test
   void countViews(){
       int i = service.countViews(1);
       System.out.println(i);
   }

   @Test
   void getLastUpdateArticle(){
       Article lastUpdateArticle = service.getLastUpdateArticle();
       System.out.println(lastUpdateArticle);
   }






}