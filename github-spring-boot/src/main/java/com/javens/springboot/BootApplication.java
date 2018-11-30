package com.javens.springboot;

import com.javens.springboot.demo.Demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableScheduling
@ComponentScan("com.javens.springboot.*")
public class BootApplication {

    public void start(){
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run(){
                System.out.println("Execute Hook.....");
            }
        }));
    }

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
        new BootApplication().start();
        try {
            Demo.run();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
