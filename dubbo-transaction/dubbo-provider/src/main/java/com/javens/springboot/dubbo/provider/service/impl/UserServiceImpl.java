/**
 * fshows.com
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.javens.springboot.dubbo.provider.service.impl;

import cn.hutool.core.convert.impl.UUIDConverter;
import com.javens.springboot.dubbo.api.CommonException;
import com.javens.springboot.dubbo.provider.db.dao.UserDAO;
import com.javens.springboot.dubbo.provider.db.dataobject.UserDO;
import com.javens.springboot.dubbo.provider.service.User2Service;
import com.javens.springboot.dubbo.provider.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import java.beans.Transient;
import java.math.BigDecimal;
import java.util.UUID;

/**
 *
 * @author liujing01
 * @version UserServiceImpl.java, v 0.1 2018-10-17 12:09 
 */
@Component
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;
    @Autowired
    private User2Service user2Service;
    @Autowired
    @Qualifier("lifeCircleTransactionManager")
    private DataSourceTransactionManager transactionManager;

    @Override
    public void enter() {

    }

    @Override
    public void test() {
        UserDO user = userDAO.getById(1);
        log.info(user.toString());
    }

    /**
     * insert return 方式
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean tm01_insert_return_true() {
        UserDO userDO = new UserDO();
        userDO.setMoney(BigDecimal.ONE);
        userDO.setPassword(UUID.randomUUID().toString());
        userDO.setUsername("Ts-"+Thread.currentThread().getName());
        Long i = userDAO.insert(userDO);
        if(i<0){
            return false;
        }
        log.info("=======tm01_insert_return_true END======"+ i);
        return true;
    }
    /**
     * insert return 方式
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean tm01_insert_return_false() {
        UserDO userDO = new UserDO();
        userDO.setMoney(BigDecimal.ONE);
        userDO.setPassword(UUID.randomUUID().toString());
        userDO.setUsername("Ts-"+Thread.currentThread().getName());
        Long i = userDAO.insert(userDO);
        if(i>0){
            return false;
        }
        log.info("=======tm01_insert_return_false END======"+ i);
        return true;
    }
    //insert throw exception
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean tm02_insert_throw_exception() {
        UserDO userDO = new UserDO();
        userDO.setMoney(BigDecimal.ONE);
        userDO.setPassword(UUID.randomUUID().toString());
        userDO.setUsername("Ts-"+Thread.currentThread().getName());
        Long i = userDAO.insert(userDO);
        if(i>0){
            throw CommonException.SYSTEM_ERROR.newInstance("插入数据错误{0}","：insert handler false");
        }
        log.info("=======tm02_insert_throw_exception END======"+ i);
        return true;
    }
    //insert throw exception non-transaction
    @Override
    public boolean m03_insert_throw_exception_non_transaction() {
        UserDO userDO = new UserDO();
        userDO.setMoney(BigDecimal.ONE);
        userDO.setPassword(UUID.randomUUID().toString());
        userDO.setUsername("Ts-"+Thread.currentThread().getName());
        Long i = userDAO.insert(userDO);
        if(i>0){
            throw CommonException.SYSTEM_ERROR.newInstance("插入数据错误{0}","：insert handler false");
        }
        log.info("=======m03_insert_throw_exception_non_transaction END======"+ i);
        return true;
    }

    @Override
    @Transactional
    public boolean tinvoke_private_method() {
        invoke_private_method();
        return true;
    }
    //这里走了事务
    private void  invoke_private_method(){
        UserDO userDO = new UserDO();
        userDO.setMoney(BigDecimal.ONE);
        userDO.setPassword(UUID.randomUUID().toString());
        userDO.setUsername("Ts-invoke_private_method");
        Long i = userDAO.insert(userDO);
        log.info("=======invoke_method======"+ i);
          throw CommonException.SYSTEM_ERROR.newInstance("插入数据错误{0}","：insert handler false");
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean tinvoke_public_method() {
        invoke_public_method();
        return false;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean tinvoke_tmethod() {
        invoke_public_tmethod();
        return false;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean tinvokeIncrementId() {
        UserDO userDO = new UserDO();
        userDO.setMoney(BigDecimal.ONE);
        userDO.setPassword(UUID.randomUUID().toString());
        userDO.setUsername("Ts-invoke_public_tmethod");
        Long i = userDAO.insert(userDO);
        log.info("=======invoke_method======"+ userDO.getId());
        throw CommonException.SYSTEM_ERROR.newInstance("插入数据错误{0}","：insert handler false");
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void selectForUpdate() {
        UserDO userDO = userDAO.getByIdForUpdate(1);
        userDO.setUsername("刘静1");
        userDAO.updateMoneyById(userDO);
    }

    @Override
    public void handSelectForUpdate() {
        TransactionStatus transaction = transactionManager.getTransaction(new DefaultTransactionDefinition());
        UserDO userDO = userDAO.getByIdForUpdate(16);
        selectUser(userDO.getId());
        transactionManager.commit(transaction);
    }

    private void selectUser(Integer id) {
        TransactionStatus transaction = transactionManager.getTransaction(new DefaultTransactionDefinition());
        UserDO userDO = userDAO.getByIdForUpdate(16);
        if(userDO.getId().equals(id)){
            userDO.setUsername("Update-Row-2");
            userDAO.updateMoneyById(userDO);
        }
        transactionManager.commit(transaction);
    }

    @Override
    public void m04invoketm() {
        invoke_public_tmethod();
    }

    @Override
    public void handlerm05invoketm() {
        handlerm05();
    }

    @Override
   // @Transactional
    public void tm06invoketm07() {
        TransactionStatus transaction = transactionManager.getTransaction(new DefaultTransactionDefinition());
        UserDO userDO = userDAO.getByIdForUpdate(6);

        user2Service.m07();
        System.out.println(userDO.getId());
        transactionManager.commit(transaction);
    }


    private void  handlerm05(){
        TransactionStatus transaction = transactionManager.getTransaction(new DefaultTransactionDefinition());

        try{
            UserDO userDO = new UserDO();
            userDO.setMoney(BigDecimal.ONE);
            userDO.setPassword(UUID.randomUUID().toString());
            userDO.setUsername("Ts-invoke_public_handlerm05");
            Long i = userDAO.insert(userDO);
            log.info("=======invoke_method======"+ i);
            throw CommonException.SYSTEM_ERROR.newInstance("插入数据错误{0}","：insert handler false");

        }catch (CommonException e){
            transactionManager.rollback(transaction);
        }
        transactionManager.commit(transaction);

    }

    @Transactional(rollbackFor = Exception.class)
    public void  invoke_public_tmethod(){
        UserDO userDO = new UserDO();
        userDO.setMoney(BigDecimal.ONE);
        userDO.setPassword(UUID.randomUUID().toString());
        userDO.setUsername("Ts-invoke_public_tmethod");
        Long i = userDAO.insert(userDO);
        log.info("=======invoke_method======"+ i);
        throw CommonException.SYSTEM_ERROR.newInstance("插入数据错误{0}","：insert handler false");
    }


    public void  invoke_public_method(){
        UserDO userDO = new UserDO();
        userDO.setMoney(BigDecimal.ONE);
        userDO.setPassword(UUID.randomUUID().toString());
        userDO.setUsername("Ts-invoke_public_method");
        Long i = userDAO.insert(userDO);
        log.info("=======invoke_method======"+ i);
        throw CommonException.SYSTEM_ERROR.newInstance("插入数据错误{0}","：insert handler false");
    }
}
