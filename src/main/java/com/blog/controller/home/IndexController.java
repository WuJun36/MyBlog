package com.blog.controller.home;

import com.blog.entity.Article;
import com.blog.entity.Comment;
import com.blog.entity.Notice;
import com.blog.entity.Tag;
import com.blog.enums.ArticleStatusEnum;
import com.blog.service.ArticleService;
import com.blog.service.CategoryService;
import com.blog.service.CommentService;
import com.blog.service.TagService;
import com.github.pagehelper.PageInfo;
import org.apache.xpath.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ：wujun
 * @date ：Created in 2020/11/10
 * @description：普通用户端默认首页
 */
@Controller
public class IndexController {

    @Autowired(required = false)
    ArticleService articleService;

    @Autowired
    CategoryService categoryService;

    @Autowired
    TagService tagService;

    @Autowired
    CommentService commentService;

    @RequestMapping(value = {"/","/article"})
    public String index(@RequestParam(required = false, defaultValue = "1") Integer pageIndex,
                        @RequestParam(required = false, defaultValue = "5") Integer pageSize,
                        Model model) {
        // 获取当前页面page分页对象
        Map<String,Object> constraint = new HashMap<>(1);  //查询约束
        constraint.put("status",ArticleStatusEnum.PUBLISH.getValue()); //文章状态
        PageInfo<Article> pageInfo = articleService.pageArticle(pageIndex,pageSize,constraint);

        model.addAttribute("pageInfo", pageInfo);

        // 获取全部公告
        List<Notice> noticeList = null;
        model.addAttribute("noticeList", noticeList);

        //获取文章数
        int articleCounts = articleService.countArticles();
        model.addAttribute("articleCounts", articleCounts);

        //获取网站概况
        Map<String, Integer> siteProfile = new HashMap<>();
        siteProfile.put("articleCount", articleService.countArticles());
        siteProfile.put("messageCount", 0);
        siteProfile.put("categoryCount", categoryService.countCategory());
        siteProfile.put("tagCount", tagService.countTags());
        siteProfile.put("linkCount", 0);
        siteProfile.put("viewCount", articleService.countViews(ArticleStatusEnum.PUBLISH.getValue()));
        model.addAttribute("siteProfile", siteProfile);

        //最后更新的文章
        Article lastUpdateArticle = articleService.getLastUpdateArticle();
        model.addAttribute("lastUpdateArticle", lastUpdateArticle);


        //获取最新的评论
        List<Comment> recentComments = commentService.getRecentComment(10);
        model.addAttribute("recentComments", recentComments);


        model.addAttribute("pageUrlPrefix", "article?pageIndex");
        return "Home/index";
    }

    @RequestMapping("/search")
    public String search(@RequestParam("keywords")String keywords,
                         @RequestParam(value = "pageIndex",defaultValue = "1") Integer pageIndex,
                         @RequestParam(value = "pageSize",defaultValue = "10") Integer pageSize,
                         Model model){

        return "success";

    }

}
