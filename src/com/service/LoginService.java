package com.service;

import com.entry.User;

import java.util.List;

public interface LoginService {
    /*查询所有*/
    public List<User> SelectUser();

    /*验证登录*/
    public List<User> LoginUser(User user);
}
