package com.bjpowernode.dubbo.dao;

import com.bjpowernode.dubbo.domain.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
}
