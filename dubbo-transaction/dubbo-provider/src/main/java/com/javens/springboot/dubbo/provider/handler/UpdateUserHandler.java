/**
 * fshows.com
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.javens.springboot.dubbo.provider.handler;

import com.javens.java.chain.AbstractBusinessHandler;
import com.javens.java.chain.HandlerRequest;
import com.javens.java.chain.HandlerResultEnum;
import com.javens.springboot.dubbo.provider.db.dao.UserDAO;
import com.javens.springboot.dubbo.provider.db.dataobject.UserDO;
import com.javens.springboot.dubbo.provider.handler.response.HandlerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author liujing01
 * @version QueryUserHandler.java, v 0.1 2018-10-20 09:17 
 */
@Component
public class UpdateUserHandler extends AbstractBusinessHandler<HandlerResponse>{
    @Autowired
    private UserDAO userDAO;
    @Override
    protected HandlerResponse doProcess(HandlerRequest<HandlerResponse> handlerRequest) {
        HandlerResponse response = handlerRequest.getResult();
        System.out.println("[username] "+ response.getUserDO().getUsername());
        return  response;
    }
}
