/**
 * fshows.com
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.javens.springboot.dubbo.provider.service.impl;

import com.javens.springboot.dubbo.provider.service.AbstractTest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 *
 * @author liujing01
 * @version ITestImpl.java, v 0.1 2018-11-02 22:32 
 */
@Component
@Slf4j
public class ITestImpl extends AbstractTest {
    @Override
    protected void doSomeThing() {
        System.out.println("do it...");
    }
}
