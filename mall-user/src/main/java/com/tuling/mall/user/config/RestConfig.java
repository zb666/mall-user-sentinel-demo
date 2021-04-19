package com.tuling.mall.user.config;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Fox
 */
@Configuration
public class RestConfig {

    
    @Bean
    //@LoadBalanced  //客戶端的負載均衡
    public RestTemplate restTemplate() {
        
        return new RestTemplate();
    }
    
    
}
