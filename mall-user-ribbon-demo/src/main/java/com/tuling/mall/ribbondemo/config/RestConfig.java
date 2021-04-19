package com.tuling.mall.ribbondemo.config;

import com.tuling.mall.ribbondemo.interceptor.MyLoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @author Fox
 */
@Configuration
public class RestConfig {

    @Bean
    @LoadBalanced
    //@MyLoadBalanced
    public RestTemplate restTemplate() {
        
        return new RestTemplate();
    }
    
    // 应用启动的时候调一些第三方接口初始化配置
    

}
