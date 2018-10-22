/**
 * fshows.com
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.javens.springboot.dubbo.provider.service;

/**
 *
 * @author liujing01
 * @version UserService.java, v 0.1 2018-10-17 12:07 
 */
public interface UserService {

    void enter();
    void test();

    /**
     * tm01_insert_return_true
     * @return
     */
    boolean tm01_insert_return_true();

    /**
     * tm01_insert_return_false
     * @return
     */
    boolean tm01_insert_return_false();

    /**
     * insert throw exception transaction
     * @return
     */
    boolean tm02_insert_throw_exception();

    /**
     * insert throw exception non-transaction
     * @return
     */
    public boolean m03_insert_throw_exception_non_transaction();

    /**
     * 事务方法调用Private MEthod
     * Private Method 是否具有事务性
     * @return
     */
    public boolean tinvoke_private_method();

    /**
     * 事务方法调用Public MEthod
     * Public Method 是否具有事务性
     * @return
     */
    public boolean tinvoke_public_method();

    /**
     *  事务方法调用事务方法
     * @return
     */
    public boolean tinvoke_tmethod();

    /**
     * 测试ID可见性
     * @return
     */
    public boolean tinvokeIncrementId();

    /**
     * 行锁测试
     */
    void selectForUpdate();

    /**
     * 非事务方法调用事务方法
     */
    public void m04invoketm();

    void invoke_public_tmethod();
}
