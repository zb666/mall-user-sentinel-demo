package com.tuling.mall.feigndemo.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;

import java.util.UUID;

/**
 * @author Fox
 */
public class FeignAuthRequestInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate template) {
        // 业务逻辑  模拟认证逻辑
        String access_token = UUID.randomUUID().toString();
        template.header("Authorization",access_token);
    }
}
