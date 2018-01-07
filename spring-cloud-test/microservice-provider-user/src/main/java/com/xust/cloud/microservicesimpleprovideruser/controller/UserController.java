package com.xust.cloud.microservicesimpleprovideruser.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.xust.cloud.microservicesimpleprovideruser.entity.User;
import com.xust.cloud.microservicesimpleprovideruser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

/**
 * description:
 * microservice-simple-provider-user-
 *
 * @Author hufeifei
 * @create 2018-01-05 11:10
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EurekaClient eureakClient;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/simple/{id}")
    public User findById(@PathVariable Long id){
        return userRepository.findOne(id);
    }

    @GetMapping("/eureka-instance")
    public String serviceURL(){
        InstanceInfo instance = eureakClient.getNextServerFromEureka("MICROSERVICE-PROVIDER-USER",false);
        return instance.getHomePageUrl();
    }

    @GetMapping("/instance-info")
    public ServiceInstance showInfo(){
        ServiceInstance localServiceInstance = discoveryClient.getLocalServiceInstance();
        return localServiceInstance;
    }

    @PostMapping("/user")
    public User postUser(@RequestBody User user){
        return user;
    }
}
