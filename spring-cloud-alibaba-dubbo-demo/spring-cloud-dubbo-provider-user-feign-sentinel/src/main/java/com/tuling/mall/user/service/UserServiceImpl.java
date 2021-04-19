package com.tuling.mall.user.service;

import com.alibaba.csp.sentinel.adapter.dubbo.config.DubboAdapterGlobalConfig;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.tuling.mall.entity.User;
import com.tuling.mall.user.mapper.UserMapper;
import com.tuling.mall.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.AsyncRpcResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
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
	@SentinelResource("getById")
	public User getById(@PathVariable("id") Integer id) {
		User user = null;
		try {
			user = userMapper.getById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}


	@PostConstruct
	public void init() {
		DubboAdapterGlobalConfig.setProviderFallback(
				(invoker, invocation, ex) -> AsyncRpcResult.newDefaultAsyncResult(new User(0,"===provider fallback=="), invocation));
	}
}