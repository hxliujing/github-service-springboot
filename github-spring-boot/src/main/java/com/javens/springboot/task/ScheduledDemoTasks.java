/**
 * fshows.com
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.javens.springboot.task;

import org.springframework.scheduling.annotation.Scheduled;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author liujing01
 * @version ScheduledDemoTasks.java, v 0.1 2018-11-30 15:21 
 */
public class ScheduledDemoTasks {

    @Scheduled(fixedRate = 5000)
    public void task() throws InterruptedException {
        for(int i=0;i<1000;i++){
            System.out.println("[ScheduledDemoTasks] counter:"+ i);
            TimeUnit.SECONDS.sleep(1);
        }

    }
}
