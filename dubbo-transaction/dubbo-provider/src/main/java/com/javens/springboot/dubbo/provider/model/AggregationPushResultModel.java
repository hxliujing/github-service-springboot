/**
 * fshows.com
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.javens.springboot.dubbo.provider.model;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author liujing01
 * @version AggregationPush2Model.java, v 0.1 2018-11-05 12:00 
 */
public class AggregationPushResultModel {
    private Boolean result;

    private String desc;

    /**
     * Getter method for property <tt>result</tt>.
     *
     * @return property value of result
     */
    public Boolean getResult() {
        return result;
    }

    /**
     * Setter method for property <tt>result</tt>.
     *
     * @param result value to be assigned to property result
     */
    public void setResult(Boolean result) {
        this.result = result;
    }

    /**
     * Getter method for property <tt>desc</tt>.
     *
     * @return property value of desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Setter method for property <tt>desc</tt>.
     *
     * @param desc value to be assigned to property desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
