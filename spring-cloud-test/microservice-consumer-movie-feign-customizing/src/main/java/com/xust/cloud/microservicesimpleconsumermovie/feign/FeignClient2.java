package com.xust.cloud.microservicesimpleconsumermovie.feign;

import com.xust.cloud.config.Configuration2;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * description:
 * microservice-spring-cloud-
 *
 * @Author hufeifei
 * @create 2018-01-07 21:36
 */
@FeignClient(name = "xxxx",url = "http://127.0.0.1:8761/",configuration = Configuration2.class)
public interface FeignClient2 {
    @RequestMapping(value = "/eureka/apps/{serviceName}")
    public String findEurekaByServiceName(@PathVariable("serviceName") String serviceName);
}
