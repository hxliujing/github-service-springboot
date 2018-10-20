/**
 * fshows.com
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.javens.springboot.dubbo.provider.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author wujn
 * @version SysConfig.java, v 0.1 2018-07-20 16:27
 */
@Configuration
public class SysConfig {

    @Value("${jdbc.pool.validationQuery}")
    private String jdbcPoolValidationQuery;
    @Value("${lifecircle.jdbc.url}")
    private String lifeCircleJdbcUrl;
    @Value("${lifecircle.jdbc.username}")
    private String lifeCircleJdbcUsername;
    @Value("${lifecircle.jdbc.password}")
    private String lifeCircleJdbcPassword;






    /**
     * Getter method for property <tt>jdbcPoolValidationQuery</tt>.
     *
     * @return property value of jdbcPoolValidationQuery
     */
    public String getJdbcPoolValidationQuery() {
        return jdbcPoolValidationQuery;
    }

    /**
     * Getter method for property <tt>lifeCircleJdbcUrl</tt>.
     *
     * @return property value of lifeCircleJdbcUrl
     */
    public String getLifeCircleJdbcUrl() {
        return lifeCircleJdbcUrl;
    }

    /**
     * Getter method for property <tt>lifeCircleJdbcUsername</tt>.
     *
     * @return property value of lifeCircleJdbcUsername
     */
    public String getLifeCircleJdbcUsername() {
        return lifeCircleJdbcUsername;
    }

    /**
     * Getter method for property <tt>lifeCircleJdbcPassword</tt>.
     *
     * @return property value of lifeCircleJdbcPassword
     */
    public String getLifeCircleJdbcPassword() {
        return lifeCircleJdbcPassword;
    }


}
