/**
 * fshows.com
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.javens.springboot.dubbo.provider;

import com.alibaba.fastjson.JSONObject;
import com.javens.springboot.dubbo.provider.model.AggregationPushResultModel;
import com.javens.springboot.dubbo.provider.service.ITest;
import com.javens.springboot.dubbo.provider.service.UserService;
import com.javens.springboot.dubbo.provider.utils.JsonObjectUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author liujing01
 * @version IitestTest.java, v 0.1 2018-11-02 22:33 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class IitestTest {
    @Autowired
    ITest itest;

    @Test
    public void test() {
        itest.say();
    }

    @Test
    public void testToString(){
        AggregationPushResultModel resultModel = new AggregationPushResultModel();
        resultModel.setResult(true);
        resultModel.setDesc("测试结果");
        System.out.println(resultModel);
    }

    @Test
    public void testIntegerEQ(){
        Integer a1 = new Integer(0);
        Integer a2 = new Integer(0);
        System.out.println("a1 EQ a2:" + a1.equals(a2));



        Integer a3 = new Integer(127);
        Integer a4 =new Integer(127);
        System.out.println("a3 EQ a4:" + (a3.equals(a4)));//true
    }




    @Test
    public void testJsonObject(){
        JSONObject ext = new JSONObject();
        ext.put("playType", -1);
        ext.put("messageType", -1);
        ext.put("floatTest", 0.34);
        ext.put("moneyAmount", "test");
        ext.put("promotionType", "-1");


        System.out.println("playType:" + JsonObjectUtil.getByKey(ext,"playType",0));//Integer 存在 -1;
        System.out.println("playType1:" + JsonObjectUtil.getByKey(ext,"playType1",99));//Integer 不存在 99;

        System.out.println("moneyAmount:" + JsonObjectUtil.getByKey(ext,"moneyAmount","test2"));//String 存在 test;
        System.out.println("moneyAmount1:" + JsonObjectUtil.getByKey(ext,"moneyAmount1","test2"));//String 不存在 test2;

        System.out.println("floatTest:" + JsonObjectUtil.getByKey(ext,"floatTest",0.00));//Float 存在 0.34;
        System.out.println("floatTest1:" + JsonObjectUtil.getByKey(ext,"floatTest1",0.01));//Float 不存在 0.01;
    }
}
