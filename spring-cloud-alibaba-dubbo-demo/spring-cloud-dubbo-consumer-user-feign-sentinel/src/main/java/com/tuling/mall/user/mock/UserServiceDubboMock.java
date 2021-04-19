package com.tuling.mall.user.mock;

import com.tuling.mall.entity.User;
import com.tuling.mall.service.UserService;

import java.util.List;

/**
 * @author Fox
 */
public class UserServiceDubboMock implements UserService {
    @Override
    public List<User> list() {
        return null;
    }

    @Override
    public User getById(Integer id) {
        return new User(0,"====mock===");
    }
}
