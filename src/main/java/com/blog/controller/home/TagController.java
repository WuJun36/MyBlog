package com.blog.controller.home;

import com.blog.entity.Article;
import com.blog.entity.Tag;
import com.blog.enums.ArticleStatusEnum;
import com.blog.service.ArticleService;
import com.blog.service.TagService;
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
 * @date ：Created in 2020/12/1
 * @description：标签controller层
 */
@Controller
@RequestMapping(value = "/tag")
public class TagController {

    @Autowired
    TagService tagService;

    @Autowired
    ArticleService articleService;

    @RequestMapping("/{tagId}")
    public String getArticleByTag(@PathVariable("tagId") Integer tagId,
                                  @RequestParam(value = "pageIndex",defaultValue = "1") Integer pageIndex,
                                  @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                                  Model model){

        if (tagId == null){
            return "Home/error/404";
        }

        // 获取标签详情
        Tag tag = tagService.getTagById(tagId);
        if (tag == null){
            return "Home/error/404";
        }
        model.addAttribute("tag",tag);

        // 获取当前标签下的分页对象
        Map<String, Object> constraint = new HashMap<>();
        constraint.put("status", ArticleStatusEnum.PUBLISH.getValue());
        constraint.put("tagId",tagId);
        PageInfo<Article> pageInfo = articleService.pageArticle(pageIndex, pageSize, constraint);
        model.addAttribute("pageInfo",pageInfo);

        //右边栏
        //热门浏览文章
        List<Article> hotArticleByView = articleService.getArticleListByViewCount(8);
        model.addAttribute("hotArticleByView",hotArticleByView);

        //热评文章
        List<Article> hotArticleByComment = articleService.getArticleListByCommentCount(8);
        model.addAttribute("hotArticleByComment",hotArticleByComment);

        //用于分页
        model.addAttribute("pageUrlPrefix", "tag/"+tagId+"?pageIndex");

        return "Home/page/articleListByTag";
    }

}
