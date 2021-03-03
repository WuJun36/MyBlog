package com.blog.controller.home;

import com.blog.entity.Article;
import com.blog.enums.ArticleStatusEnum;
import com.blog.service.ArticleService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author ：wujun
 * @date ：Created in 2020/11/10
 * @description：文章Controller层
 */
@Controller
@RequestMapping(value = "/article")
public class ArticleController {

    Logger logger = Logger.getLogger(ArticleController.class);

    @Autowired
    ArticleService articleService;

    @RequestMapping(value = "/{articleId}")
    public String getArticleDetailPage(@PathVariable("articleId") Integer articleId, Model model) {
        //左边栏
        // 文章详情
        Article article = articleService.getArticleById(articleId);
        if (article == null) {
            return "Home/error/404";
        }
        model.addAttribute("article", article);

        //右边栏
        //热门浏览文章
        List<Article> hotArticleByView = articleService.getArticleListByViewCount(8);
        model.addAttribute("hotArticleByView", hotArticleByView);

        //热评文章
        List<Article> hotArticleByComment = articleService.getArticleListByCommentCount(8);
        model.addAttribute("hotArticleByComment", hotArticleByComment);

        return "Home/page/articleDetail";
    }

    @RequestMapping("/like/{articleId}")
    public void likeArticle(@PathVariable("articleId") Integer articleId) {
        //点赞数增加1
        Integer increaseCount = 1;
        articleService.likeArticle(articleId,increaseCount);
    }
}
