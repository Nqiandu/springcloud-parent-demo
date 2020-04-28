package com.xxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author JN
 * @Date 2020/4/28 16:28
 * @Version 1.0
 **/
@SpringBootApplication
@EnableConfigServer
public class ApplicationRun3081 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun3081.class, args);
    }

}
