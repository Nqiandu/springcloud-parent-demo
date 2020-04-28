package com.xxx.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author JN
 * @Date 2020/4/28 17:16
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
@MapperScan("com.xxx.springcloud.mapper")
public class ApplicationRun8084 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8084.class, args);
    }

}
