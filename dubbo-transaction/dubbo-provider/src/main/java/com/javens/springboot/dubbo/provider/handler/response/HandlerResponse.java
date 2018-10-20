/**
 * fshows.com
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.javens.springboot.dubbo.provider.handler.response;

import com.javens.java.chain.HandlerResult;
import com.javens.java.chain.HandlerResultEnum;
import com.javens.springboot.dubbo.provider.db.dataobject.UserDO;

/**
 *
 * @author liujing01
 * @version HandlerResponse.java, v 0.1 2018-10-20 10:13 
 */
public class HandlerResponse extends HandlerResult {

    public HandlerResponse(int code, String result) {
        super(code, result);
    }

    public HandlerResponse(HandlerResultEnum resultEnum) {
        super(resultEnum);
    }

    public HandlerResponse() {
        super();
    }

    private UserDO userDO;

    /**
     * Getter method for property <tt>userDO</tt>.
     *
     * @return property value of userDO
     */
    public UserDO getUserDO() {
        return userDO;
    }

    /**
     * Setter method for property <tt>userDO</tt>.
     *
     * @param userDO value to be assigned to property userDO
     */
    public void setUserDO(UserDO userDO) {
        this.userDO = userDO;
    }
}
