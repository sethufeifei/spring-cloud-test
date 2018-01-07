package com.xust.cloud.microservicesimpleconsumermovie.controller;

import com.xust.cloud.microservicesimpleconsumermovie.feign.FeignClient2;
import com.xust.cloud.microservicesimpleconsumermovie.feign.UserFeignClient;
import com.xust.cloud.microservicesimpleconsumermovie.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
 * description:
 * microservice-simple-consumer-movie-
 *
 * @Author hufeifei
 * @create 2018-01-05 21:24
 */
@RestController
public class MovieController {

    @Autowired
    private UserFeignClient userFeignClient;

    @Autowired
    private FeignClient2 feignClient2;


    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id){
        return userFeignClient.findById(id);
    }


    @GetMapping("/{serviceName}")
    public String findEurekaByServiceName(@PathVariable String serviceName){
        return feignClient2.findEurekaByServiceName(serviceName);
    }
}
