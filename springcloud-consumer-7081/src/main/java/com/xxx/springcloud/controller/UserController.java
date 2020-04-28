package com.xxx.springcloud.controller;

import com.xxx.springcloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author JN
 * @Date 2020/4/28 16:33
 * @Version 1.0
 **/
@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/allUser")
    public List<User> selectAllUsers() {
        return restTemplate.getForObject("http://USER-PROVIDER/userAll", List.class);
    }

    @GetMapping("/userAll")
    public List<User> selectAllUser() {
        return restTemplate.getForObject("http://USER-PROVIDER-HYSTRIX/hystrixUser", List.class);
    }
}
