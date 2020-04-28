package com.xxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author JN
 * @Date 2020/4/28 16:31
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationRun7081 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun7081.class, args);
    }

}
