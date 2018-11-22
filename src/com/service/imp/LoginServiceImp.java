package com.service.imp;

import com.dao.LoginUser;
import com.entry.User;
import org.springframework.stereotype.Service;
import com.service.LoginService;

import javax.annotation.Resource;
import java.util.List;

@Service("loginService")
public class LoginServiceImp implements LoginService {
    @Resource
    private LoginUser loginUser;

    public List<User> LoginUser(User user) {
        return loginUser.LoginUser(user);
    }

    public List<User> SelectUser() {
        return null;
    }
}
