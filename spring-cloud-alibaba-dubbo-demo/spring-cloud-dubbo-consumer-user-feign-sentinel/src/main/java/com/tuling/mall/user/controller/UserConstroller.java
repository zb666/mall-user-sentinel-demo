package com.tuling.mall.user.controller;

import com.alibaba.cloud.dubbo.annotation.DubboTransported;
import com.alibaba.csp.sentinel.adapter.dubbo.config.DubboAdapterGlobalConfig;
import com.tuling.mall.entity.User;
import com.tuling.mall.service.UserService;
import com.tuling.mall.user.feign.UserDubboFeignService;
import com.tuling.mall.user.feign.UserFeignService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.rpc.AsyncRpcResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author Fox
 */
@RestController
@RequestMapping("/user")
public class UserConstroller {

    @DubboReference(mock = "com.tuling.mall.user.mock.UserServiceDubboMock")
    private UserService userService;

    @RequestMapping("/info/{id}")
    public User info(@PathVariable("id") Integer id) {
        User user = null;
        try {
            user = userService.getById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    @PostConstruct
    public void init() {
        DubboAdapterGlobalConfig.setConsumerFallback(
                (invoker, invocation, ex) -> AsyncRpcResult.newDefaultAsyncResult(
                        new User(0,"===fallback=="), invocation));
    }



    @Autowired
    @DubboTransported
    private UserFeignService userFeignService;

    @RequestMapping("/list")
    public List<User> list() {
        return userFeignService.list();
    }

    @Autowired
    private UserDubboFeignService userDubboFeignService;

    @RequestMapping("/list2")
    public List<User> list2() {

        return userDubboFeignService.list();
    }

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    @DubboTransported
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @RequestMapping("/list3")
    public List<User> list3() {
        String url = "http://spring-cloud-dubbo-provider-user-feign/user/list";
        return restTemplate.getForObject(url, List.class);
    }


}
