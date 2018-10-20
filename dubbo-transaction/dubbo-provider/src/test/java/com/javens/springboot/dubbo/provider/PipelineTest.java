/**
 * fshows.com
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.javens.springboot.dubbo.provider;

import com.javens.java.chain.DefaultPipeline;
import com.javens.java.chain.HandlerRequest;
import com.javens.java.chain.Pipeline;
import com.javens.java.chain.handler.Business1Handler;
import com.javens.java.chain.handler.Business2Handler;
import com.javens.java.chain.handler.Business3Handler;
import com.javens.springboot.dubbo.provider.handler.QueryUserHandler;
import com.javens.springboot.dubbo.provider.handler.UpdateUserHandler;
import com.javens.springboot.dubbo.provider.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author liujing01
 * @version ApplicationTest.java, v 0.1 2018-09-28 9:58
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PipelineTest {
    @Autowired
    QueryUserHandler queryUserHandler;

    @Autowired
    private UpdateUserHandler updateUserHandler;
    @Test
    public void test() {
        Pipeline pipeline = new DefaultPipeline();
        pipeline.addLast("query",queryUserHandler);
        pipeline.addLast("update",updateUserHandler);
        try {
            System.out.println("End:"+ pipeline.process());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}