/**
 * fshows.com
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.javens.springboot.dubbo.provider;

import com.javens.springboot.dubbo.provider.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author liujing01
 * @version ApplicationTest.java, v 0.1 2018-09-28 9:58
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TccTest {
    @Autowired
    UserService userService;

    @Test
    public void test() {
        userService.test();
    }
    @Test
    public void tm01_insert_return_true() {
        userService.tm01_insert_return_true();
    }
    @Test
    public void tm01_insert_return_false() {
        userService.tm01_insert_return_false();
    }

    @Test
    public void tm02() {
        userService.tm02_insert_throw_exception();
    }

    @Test
    public void m03() {
        userService.m03_insert_throw_exception_non_transaction();
    }

    @Test
    public void tinvoke_private_method(){
        userService.tinvoke_private_method();
    }

    @Test
    public void tinvoke_public_method(){
        userService.tinvoke_public_method();
    }

    @Test
    public void tinvoke_t_method(){
        userService.tinvoke_tmethod();
    }

    @Test
    public void tinvokeIncrementId(){
        userService.tinvokeIncrementId();
    }

    @Test
    public void selectForUpdate(){
        userService.selectForUpdate();
    }
}