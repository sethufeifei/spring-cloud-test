package com.xust.cloud.microservicesimpleconsumermovie.feign;

import com.xust.cloud.microservicesimpleconsumermovie.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * description:
 * microservice-spring-cloud-
 *
 * @Author hufeifei
 * @create 2018-01-07 20:28
 */
@FeignClient(name = "microservice-provider-user")
public interface UserFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/simple/{id}")
    public User findById(@PathVariable("id") Long id);


    @RequestMapping(method = RequestMethod.POST, value = "/user")
    public User findById(@RequestBody User user);

}
