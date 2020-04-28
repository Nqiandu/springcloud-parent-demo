package com.xxx.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author JN
 * @Date 2020/4/28 17:06
 * @Version 1.0
 * @Description
 *      @EnableDiscoveryClient:自动向eureka注册中心注册服务
 **/
@SpringBootApplication
@MapperScan("com.xxx.springcloud.mapper")
@EnableDiscoveryClient
public class ApplicationRun8081 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8081.class, args);
    }


}