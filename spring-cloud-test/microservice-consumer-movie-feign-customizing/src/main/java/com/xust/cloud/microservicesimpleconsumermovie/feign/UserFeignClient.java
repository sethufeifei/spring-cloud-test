package com.xust.cloud.microservicesimpleconsumermovie.feign;

import com.xust.cloud.config.Configuration1;
import com.xust.cloud.config.Configuration2;
import com.xust.cloud.microservicesimpleconsumermovie.entity.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * description:
 * microservice-spring-cloud-
 *
 * @Author hufeifei
 * @create 2018-01-07 20:28
 */

@FeignClient(name = "microservice-provider-user",configuration = Configuration1.class)
public interface UserFeignClient {

    @RequestLine("GET /simple/{id}")
    public User findById(@Param("id") Long id);
}
