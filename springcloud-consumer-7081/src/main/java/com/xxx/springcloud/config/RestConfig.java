package com.xxx.springcloud.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author JN
 * @Date 2020/4/28 16:32
 * @Version 1.0
 * @Description
  *      @LoadBalanced:开启客户端的负载均衡
 **/
@SpringBootApplication
public class RestConfig {

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
