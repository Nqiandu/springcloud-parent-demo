package com.xxx.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author JN
 * @Date 2020/4/28 17:13
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.xxx.springcloud.mapper")
public class ApplicationRun8083 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8083.class, args);
    }

}
