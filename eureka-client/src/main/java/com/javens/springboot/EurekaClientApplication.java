package com.javens.springboot;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.javens.springboot.*")
@RestController
public class EurekaClientApplication {
    @Autowired
    private EurekaClient eurekaClient;//服务发现客户端


    /*@GetMapping(value = "/add")
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        ServiceInstance instance = eurekaClient.getInstances("STORES").get(0);
        Integer r = a + b;
        System.out.println("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + r);
        return r;
    }*/

    @RequestMapping("/serviceUrl")
    public String serviceUrl(){
        Set set = eurekaClient.getAllKnownRegions();
        System.out.println(set);
        InstanceInfo instance = eurekaClient.getNextServerFromEureka("STORES", false);
        return instance.getHomePageUrl();
    }

    @RequestMapping("/")
    public String home() {
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }
}
