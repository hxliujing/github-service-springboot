/**
 * fshows.com
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.javens.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author liujing01
 * @version RibbonRestController.java, v 0.1 2018-10-30 22:58 
 */
@RestController
public class IndexRestController {


    @RequestMapping("/")
    public String home() {
        return "Hello World";
    }
}
