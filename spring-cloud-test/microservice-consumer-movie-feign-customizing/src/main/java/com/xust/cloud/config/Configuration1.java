package com.xust.cloud.config;

import feign.Contract;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * description:
 * microservice-spring-cloud-
 *
 * @Author hufeifei
 * @create 2018-01-07 21:25
 */
@Configuration
public class Configuration1 {

    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
