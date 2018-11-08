package com.javens.springboot;

import com.javens.springboot.demo.Demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan("com.javens.springboot.*")
public class BootApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
        try {
            Demo.run();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
