package com.blog.test;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import java.net.URL;


/**
 * @author ：wujun
 * @date ：Created in 2020/11/10
 * @description：Login4j使用测试类
 */
public class Log4jTest {


    public static void main(String[] args) {

//        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
//        System.out.println(contextClassLoader);
        // 获取Logger对象实例
        Logger logger = Logger.getLogger(Log4jTest.class);

//        BasicConfigurator.configure();
        logger.error("这是ERROR");
        logger.warn("这是WARN");
        logger.debug("这是DEBUG");

    }
}
