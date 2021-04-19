package com.tuling.mall.user.controller;

import com.tuling.mall.entity.User;
import com.tuling.mall.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * @author Fox
 */
@RestController
@RequestMapping("/user")
public class UserConstroller {

    @DubboReference
    private UserService userService;

    @RequestMapping("/info/{id}")
    public User info(@PathVariable("id") Integer id){
        return userService.getById(id);
    }
    
    @RequestMapping("/list")
    public List<User> list(){

        return userService.list();
    }
}
