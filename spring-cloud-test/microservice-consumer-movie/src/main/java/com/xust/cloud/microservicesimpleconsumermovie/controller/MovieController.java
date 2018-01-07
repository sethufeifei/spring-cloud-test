package com.xust.cloud.microservicesimpleconsumermovie.controller;

import com.xust.cloud.microservicesimpleconsumermovie.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
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
    private RestTemplate restTemplate;

    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id){
        return restTemplate.getForObject("http://localhost:7900/simple/"+id,User.class);
    }
}
