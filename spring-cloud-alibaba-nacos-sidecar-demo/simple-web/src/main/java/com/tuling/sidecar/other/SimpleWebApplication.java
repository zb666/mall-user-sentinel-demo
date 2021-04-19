package com.tuling.sidecar.other;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@SpringBootApplication
@RestController
public class SimpleWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleWebApplication.class,args);
    }


    @GetMapping("/health")
    public String health(){
        return "{\"status\":\"UP\"}";
    }

    @GetMapping(value = "/hello")
    public String hello(){
        return "模拟sidecar接入异构服务";
    }

}
