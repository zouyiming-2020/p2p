package com.bjpowernode.dubbo.controller;

import com.bjpowernode.dubbo.domain.User;
import com.bjpowernode.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    //userService爆红，是不影响的，因为我们是在配置文件中远程获取的service对象，而不是直接注入到容器中。
    //使用Maven插件运行服务器时，需要手动install，jar包资源。只要是jar包有变动就必须install。
    //最好先执行clean，再执行install。
    //顺序是：service工程依赖dao，dao依赖domain
    //dao和domain都是jar工程，它们两个都需要install，先安装domain再安装dao。
    //以后写工程都是父工程，clean install父工程。
    @Autowired
    private UserService userService;

    @RequestMapping("/findAll.do")
    public void findAll(){
        List<User> userList = userService.findAll();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
