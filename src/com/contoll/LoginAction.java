package com.contoll;

import com.entry.User;
import com.service.LoginService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@Controller
@Scope("prototype")
@RequestMapping("/login")
public class LoginAction {

    @Resource
    public LoginService loginService;

    @RequestMapping("/auth")
    public String Login(HttpServletRequest request) throws IOException {
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        User user = new User();
        user.setName(name);
        user.setPwd(pwd);
        List<User> list = loginService.LoginUser(user);
        for (User u:list) {
            System.out.println(u.getId() + "----" +u.getName());
        }
        if(list != null && list.size() > 0){
            return "forward:/index2.jsp";
        }else{
            System.out.println("没有登进去");
            return "forward:/index.jsp";
        }
    }
}
