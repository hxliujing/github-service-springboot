/**
 * fshows.com
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.javens.springboot.dubbo.provider.service;

/**
 *
 * @author liujing01
 * @version AbstractTest.java, v 0.1 2018-11-02 22:30 
 */
public abstract class AbstractTest implements ITest {

    @Override
    public boolean say() {
        System.out.println("=====say start====");

        doSomeThing();
        System.out.println("=====say end ====");
        return false;
    }

    protected abstract void doSomeThing();
}
