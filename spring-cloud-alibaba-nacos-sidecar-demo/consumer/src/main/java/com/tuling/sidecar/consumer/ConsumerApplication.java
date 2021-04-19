package com.tuling.sidecar.consumer;

import com.tuling.sidecar.consumer.feign.SidecarFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableFeignClients
@RestController
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }

    @Autowired
    SidecarFeign sidecarFeign;

    @GetMapping("hello")
    public String hello(){
        return sidecarFeign.hello();
    }

}
