package com.tuling.mall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class SpringCloudDubboConsumerUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDubboConsumerUserApplication.class, args);
    }

}


