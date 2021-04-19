package com.tuling.mall.user;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudDubboProviderUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDubboProviderUserApplication.class, args);
    }

}


