package com.tuling.mall.service;

import com.tuling.mall.entity.User;

import java.util.List;

public interface UserService {


	List<User> list();


	User getById(Integer id);

}