package com.tuling.mall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringCloudDubboConsumerUserFeignSentinelApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDubboConsumerUserFeignSentinelApplication.class, args);
    }

}


