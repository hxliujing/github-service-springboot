/**
 * fshows.com
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.javens.springboot.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author liujing01
 * @version HelloController.java, v 0.1 2018-10-10 19:36 
 */
@RestController
public class HelloController {
    /*@Autowired
    private CounterService counterService;*/

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping ("/hello")
    public String greet() {
        //counterService.increment("didispace.hello.count");
        return "";
    }
}
