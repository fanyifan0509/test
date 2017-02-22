package com.lai.controller;

import com.lai.entity.User;
import com.lai.service.UserService;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/02/21.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/toWelcome")
    public String toWelcome(String id, HttpServletRequest request){
        Integer userid = Integer.valueOf(id);
        User user = userService.getUserById(userid);
        if(user != null){
            request.setAttribute("user",user);
            return "welcome";
        }
        else return "nobody";
    }
}
