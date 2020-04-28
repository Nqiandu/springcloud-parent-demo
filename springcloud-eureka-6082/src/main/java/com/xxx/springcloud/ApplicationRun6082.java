package com.xxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author JN
 * @Date 2020/4/28 16:59
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class ApplicationRun6082 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun6082.class, args);
    }

}