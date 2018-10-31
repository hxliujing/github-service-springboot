/**
 * fshows.com
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.javens.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author liujing01
 * @version RestController.java, v 0.1 2018-10-30 22:56 
 */
@RestController
public class EurekaRestController {
    @Autowired
    private DiscoveryClient discoveryClient;
    @RequestMapping("/hello")
    public String serviceUrl(){
        discoveryClient.getServices().stream().forEach(x->{
            System.out.println(x);
        });
        return "Hello World";
    }
}
