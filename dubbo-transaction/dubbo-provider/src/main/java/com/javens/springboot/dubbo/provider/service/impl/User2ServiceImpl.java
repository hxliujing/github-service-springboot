/**
 * fshows.com
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.javens.springboot.dubbo.provider.service.impl;

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
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import java.math.BigDecimal;
import java.util.UUID;

/**
 *
 * @author liujing01
 * @version UserServiceImpl.java, v 0.1 2018-10-17 12:09 
 */
@Component
@Slf4j
public class User2ServiceImpl implements User2Service {
    @Autowired
    private UserDAO userDAO;
    @Autowired
    @Qualifier("lifeCircleTransactionManager")
    private DataSourceTransactionManager transactionManager;


    //@Transactional(propagation= Propagation.REQUIRES_NEW)
    @Override
    public void m07() {
        TransactionStatus transaction = transactionManager.getTransaction(new DefaultTransactionDefinition());

        UserDO userDO = userDAO.getByIdForUpdate(5);
        System.out.println(userDO.getId());

        transactionManager.commit(transaction);

    }
}
