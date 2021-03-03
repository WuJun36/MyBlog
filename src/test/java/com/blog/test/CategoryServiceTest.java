package com.blog.test;

import com.blog.entity.Category;
import com.blog.service.ArticleService;
import com.blog.service.CategoryService;
import com.blog.service.imp.CategoryServiceImp;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CategoryServiceTest {

    ApplicationContext ioc = new ClassPathXmlApplicationContext("spring/spring-mybatis.xml");
    CategoryService service = ioc.getBean(CategoryService.class);

    @Test
    void getAllCategory() {
        List<Category> allCategory = service.getAllCategory();
        if (allCategory != null){
            allCategory.forEach(System.out::println);
        }
    }

    @Test
    void countCategory() {
        System.out.println(service.countCategory());
    }
}