package com.xust.cloud.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * description:
 * microservice-spring-cloud-自定义配置负载均衡
 *
 * @Author hufeifei
 * @create 2018-01-07 0:53
 */
@Configuration

public class TestConfiguration {

    @Autowired
    IClientConfig config;

    @Bean
    public IRule ribbonRule(IClientConfig config){
        return new RandomRule();
    }
}
