package com.xxx.springcloud.controller;

import com.xxx.springcloud.model.User;
import com.xxx.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author JN
 * @Date 2020/4/28 17:10
 * @Version 1.0
 **/
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userOne")
    public User selectById() {
        return userService.selectById(2L);
    }

    @RequestMapping("/userAll")
    public List<User> selectAllUsers() {
        return userService.selectAllUser();
    }
}
