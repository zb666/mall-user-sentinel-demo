package com.tuling.mall.user.service;

import com.tuling.mall.entity.User;
import com.tuling.mall.user.mapper.UserMapper;
import com.tuling.mall.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@DubboService
@Slf4j
@RestController
@RequestMapping("/user")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	@RequestMapping("/list")
	public List<User> list() {
		log.info("查询user列表");
		return userMapper.list();
	}

	@Override
	@RequestMapping("/getById/{id}")
	public User getById(@PathVariable("id") Integer id) {
		return userMapper.getById(id);
	}
}