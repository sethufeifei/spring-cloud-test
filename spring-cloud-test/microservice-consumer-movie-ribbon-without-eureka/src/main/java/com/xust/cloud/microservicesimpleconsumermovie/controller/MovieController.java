package com.xust.cloud.microservicesimpleconsumermovie.controller;

import com.xust.cloud.microservicesimpleconsumermovie.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


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
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id){
//        microservice-provider-user   vip  virtual ip   虚拟ip
        return restTemplate.getForObject("http://microservice-provider-user/simple/"+id,User.class);
    }

    @GetMapping("/test")
    public String Test(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("microservice-provider-user");
        System.out.print("111"+":"+serviceInstance.getServiceId()+":"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"  ");
//        ServiceInstance serviceInstance2 = loadBalancerClient.choose("microservice-provider-user2");
//        System.out.print("222"+":"+serviceInstance2.getServiceId()+":"+serviceInstance2.getHost()+":"+serviceInstance2.getPort()+"\n");
        return "1";
    }
}
