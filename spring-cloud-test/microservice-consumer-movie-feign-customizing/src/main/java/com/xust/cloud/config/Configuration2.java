package com.xust.cloud.config;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * description:
 * microservice-spring-cloud-
 *
 * @Author hufeifei
 * @create 2018-01-07 21:47
 */
@Configuration
public class Configuration2 {

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("user", "password123");
    }
}
