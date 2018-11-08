/**
 * fshows.com
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.javens.springboot.dubbo.provider.utils;


import com.alibaba.fastjson.JSONObject;

/**
 *
 * @author liujing01
 * @version JsonObjectUtil.java, v 0.1 2018-11-06 11:16 
 */
public class JsonObjectUtil {


    public static <T> T getByKey(JSONObject jsonObject, String key, T defaultV) {
        Object value =  jsonObject.get(key);
        if(value==null){
            return defaultV;
        }
        String value1 = value.toString();
        return (T)value1;
    }
}
