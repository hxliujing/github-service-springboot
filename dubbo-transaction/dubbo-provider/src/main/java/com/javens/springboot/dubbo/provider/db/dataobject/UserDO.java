/**
 * fshows.com
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.javens.springboot.dubbo.provider.db.dataobject;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * @author myabtis-dalgen
 * @version UserDO.java, v 0.1 2018-10-17 11:51
 * The table SP_USER
 */
public class UserDO {
    /**
     * id ID.
     */
    private Integer id;
    /**
     * money MONEY.
     */
    private BigDecimal money;
    /**
     * password PASSWORD.
     */
    private String password;
    /**
     * username USERNAME.
     */
    private String username;

    /**
     * Set id ID.
     */
    public void setId(Integer id){
        this.id = id;
    }

    /**
     * Get id ID.
     *
     * @return the string
     */
    public Integer getId(){
        return id;
    }

    /**
     * Set money MONEY.
     */
    public void setMoney(BigDecimal money){
        this.money = money;
    }

    /**
     * Get money MONEY.
     *
     * @return the string
     */
    public BigDecimal getMoney(){
        return money;
    }

    /**
     * Set password PASSWORD.
     */
    public void setPassword(String password){
        this.password = password;
    }

    /**
     * Get password PASSWORD.
     *
     * @return the string
     */
    public String getPassword(){
        return password;
    }

    /**
     * Set username USERNAME.
     */
    public void setUsername(String username){
        this.username = username;
    }

    /**
     * Get username USERNAME.
     *
     * @return the string
     */
    public String getUsername(){
        return username;
    }


    @Override
    public String toString() {
        return new org.apache.commons.lang3.builder.ToStringBuilder(this)
                .append("id", id)
                .append("money", money)
                .append("password", password)
                .append("username", username)
                .toString();
    }
}
