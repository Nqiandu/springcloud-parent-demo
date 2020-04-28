package com.xxx.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author JN
 * @Date 2020/4/28 16:25
 * @Version 1.0
 **/
@RestController
public class TestController {


    @Value("${server.port}")
    private String port;

    @Value("${spring.datasource.url}")
    private String datasourceUrl;

    @RequestMapping("/getConfig")
    public String config() {
        return port+"---------"+datasourceUrl;
    }
}
