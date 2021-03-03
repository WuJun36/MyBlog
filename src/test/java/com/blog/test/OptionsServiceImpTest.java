package com.blog.test;

import com.blog.entity.Options;
import com.blog.service.OptionsService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class OptionsServiceImpTest {

    ApplicationContext ioc = new ClassPathXmlApplicationContext("spring/spring-mybatis.xml");
    OptionsService service = ioc.getBean(OptionsService.class);

    @Test
    void getOptions() {
        Options options = service.getOptions();
        System.out.println(options);
    }
}