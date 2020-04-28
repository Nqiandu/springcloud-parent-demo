package com.xxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author JN
 * @Date 2020/4/28 17:21
 * @Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class ApplicationRun5081 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun5081.class, args);
    }

}
