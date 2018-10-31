/**
 * fshows.com
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.javens.springboot.controller;

import com.javens.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author liujing01
 * @version RibbonRestController.java, v 0.1 2018-10-30 22:58 
 */
@RestController
public class RibbonRestController {
    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping("/ribbon-consumer")
    public String ribbonConsumer(){
        return restTemplate.getForEntity("http://EUREKA-CLIENT/hello",
                String.class) . getBody();
    }

    @RequestMapping("/get_param")
    public String restTeplateGetParam() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://EUREKA-CLIENT/user?name={1}",String.class,"didi");
        String body = responseEntity.getBody();
        return body;
    }

    @RequestMapping("/get_pojo")
    public User restTeplateGetPOJO() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<User> responseEntity = restTemplate.getForEntity("http://EUREKA-CLIENT/user?name={1}",User.class,"didi");
        User body  = responseEntity.getBody();
        return body;
    }
    @RequestMapping("/get_param_map")
    public String restTeplateGetParamsMap() {
        RestTemplate restTemplate = new RestTemplate();
        Map<String,String> param = new HashMap<>();
        param.put("name","data");
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://EUREKA-CLIENT/user?name={name}",String.class,param);
        String body = responseEntity.getBody();
        return body;
    }

    @RequestMapping("/post_pojo")
    public String restTeplatePostPOJO() {
        RestTemplate restTemplate = new RestTemplate();
        User user = new User();
        ResponseEntity<String> responseEntity = restTemplate.postForEntity("http://EUREKA-CLIENT/user",user,String.class);
        String body  = responseEntity.getBody();
        return body;
    }
}
