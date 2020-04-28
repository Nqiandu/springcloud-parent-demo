package com.xxx.springcloud.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Author JN
 * @Date 2020/4/28 16:53
 * @Version 1.0
 **/
@SpringBootApplication
public class RestConfig {

    @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /*@Bean
    public RandomRule randomRule() {
        return new RandomRule();
    }*/

}
