package com.blog.controller.home;

import com.blog.dao.ArticleMapper;
import com.blog.dao.CategoryMapper;
import com.blog.entity.Article;
import com.blog.entity.Category;
import com.blog.enums.ArticleStatusEnum;
import com.blog.service.ArticleService;
import com.blog.service.CategoryService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ：wujun
 * @date ：Created in 2020/11/29
 * @description：分类controller层
 */
@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/{categoryId}")
    public String getArticlesByCategory(@PathVariable("categoryId") Integer categoryId,
                                        @RequestParam(value = "pageIndex",defaultValue = "1") int pageIndex,
                                        @RequestParam(value = "pageSize",defaultValue = "10") int pageSize,
                                        Model model) {
        //分类详情
        Category category = categoryService.getCategoryById(categoryId);
        if (category == null){
            return "Home/error/404";
        }
        model.addAttribute("category",category);

        //该分类下的文章列表
        Map<String, Object> constraint = new HashMap<>();
        constraint.put("categoryId",categoryId);
        constraint.put("status", ArticleStatusEnum.PUBLISH.getValue());
        PageInfo<Article> pageInfo = articleService.pageArticle(pageIndex,pageSize,constraint);
        model.addAttribute("pageInfo",pageInfo);

        //右边栏
        //热门浏览文章
        List<Article> hotArticleByView = articleService.getArticleListByViewCount(8);
        model.addAttribute("hotArticleByView",hotArticleByView);

        //热评文章
        List<Article> hotArticleByComment = articleService.getArticleListByCommentCount(8);
        model.addAttribute("hotArticleByComment",hotArticleByComment);

        model.addAttribute("pageUrlPrefix", "category/"+categoryId+"?pageIndex");


        return "Home/page/articleListByCategory";
    }
}
