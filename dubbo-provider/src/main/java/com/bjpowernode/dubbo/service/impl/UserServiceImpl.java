package com.bjpowernode.dubbo.service.impl;

import com.bjpowernode.dubbo.dao.UserDao;
import com.bjpowernode.dubbo.domain.User;
import com.bjpowernode.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public List<User> findAll() {
        return userDao.findAll();
//        List<User> userList  = new ArrayList<User>();
//        User user = new User();
//        for(int i=0;i<10;i++){
//            user.setId(i+"");
//            user.setCreateTime(new SimpleDateFormat().format(new Date()));
//            user.setName("张三"+i);
//            userList.add(user);
//        }
//        return userList;
    }
}
