package com.blog.interceptor;


import com.blog.entity.Category;
import com.blog.entity.Tag;
import com.blog.service.CategoryService;
import com.blog.service.OptionsService;
import com.blog.service.TagService;
import org.apache.ibatis.plugin.Intercepts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.blog.entity.Options;

import java.util.List;

/**
 * @author ：wujun
 * @date ：Created in 2020/11/18
 * @description：获取页面公共资源
 */
@Component
public class HomeResourceInterceptor  implements HandlerInterceptor {

    @Autowired
    private OptionsService optionsService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private TagService tagService;


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //获取网站基本信息
        Options options = optionsService.getOptions();
        request.setAttribute("options",options);

        //获取全部分类，用于top主菜单栏展示
        List<Category> categoryList = categoryService.getAllCategory();
        request.setAttribute("categoryList",categoryList);

        //获取全部的标签
        List<Tag> tagList = tagService.getAllTags();
        request.setAttribute("tagList", tagList);


        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
