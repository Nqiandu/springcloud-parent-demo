package com.xxx.springcloud.controller;

import com.xxx.springcloud.api.IUserService;
import com.xxx.springcloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author JN
 * @Date 2020/4/28 17:02
 * @Version 1.0
 **/
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/userAll")
    public List<User> selectAllUsers() {
        return userService.selectAllUsers();
    }

    @RequestMapping("/userOne")
    public User selectOne() {
        return userService.selectOne();
    }
}
