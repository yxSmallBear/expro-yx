package com.dao;

import com.entry.User;

import java.util.List;

public interface LoginUser {
    public List<User> SelectUser();

    public List<User> LoginUser(User user);
}
