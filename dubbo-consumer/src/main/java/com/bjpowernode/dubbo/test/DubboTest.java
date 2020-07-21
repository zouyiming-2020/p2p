package com.bjpowernode.dubbo.test;

import com.bjpowernode.dubbo.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboTest {
    public static void main(String[] args) {
        //加载配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/dispatcherServlet.xml");
        UserService uService = context.getBean("uService", UserService.class);
        System.out.println(uService);
    }
}
