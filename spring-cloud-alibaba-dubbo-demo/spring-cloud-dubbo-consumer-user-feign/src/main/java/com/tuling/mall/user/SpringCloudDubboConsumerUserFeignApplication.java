package com.tuling.mall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringCloudDubboConsumerUserFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDubboConsumerUserFeignApplication.class, args);
    }

}


