package com.blog.test;

import com.blog.entity.Tag;
import com.blog.service.TagService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TagServiceImpTest {

    ApplicationContext ioc = new ClassPathXmlApplicationContext("spring/spring-mybatis.xml");
    TagService service = ioc.getBean(TagService.class);

    @Test
    void countTags() {
        int i = service.countTags();
        System.out.println(i);
    }

    @Test
    void selectAllTags(){
        List<Tag> allTags = service.getAllTags();
        if (allTags != null){
            allTags.forEach(System.out::println);
        }
    }
}