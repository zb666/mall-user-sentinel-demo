package com.tuling.mall.user.feign;

import com.alibaba.cloud.dubbo.annotation.DubboTransported;
import com.tuling.mall.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Fox
 */
@FeignClient(value = "spring-cloud-dubbo-provider-user-feign",path = "/user")
@DubboTransported(protocol = "dubbo")
public interface UserDubboFeignService {

    @RequestMapping("/list")
    List<User> list();

    @RequestMapping("/getById/{id}")
    User getById(@PathVariable("id") Integer id);
}
