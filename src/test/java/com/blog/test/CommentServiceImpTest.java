package com.blog.test;

import com.blog.entity.Comment;
import com.blog.service.CommentService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CommentServiceImpTest {

    ApplicationContext ioc = new ClassPathXmlApplicationContext("spring/spring-mybatis.xml");
    CommentService commentService = ioc.getBean(CommentService.class);

    @Test
    void getRecentComment() {
        List<Comment> recentComment = commentService.getRecentComment(10);
        if (recentComment != null){
            recentComment.forEach(System.out::println);
        }else {
            System.out.println("暂无记录");
        }
    }
}