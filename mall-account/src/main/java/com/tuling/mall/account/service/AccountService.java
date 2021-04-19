package com.tuling.mall.account.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tuling.common.utils.PageUtils;
import com.tuling.mall.account.entity.AccountEntity;

import java.util.Map;

/**
 * 
 *
 * @author fox
 * @email 2763800211@qq.com
 * @date 2021-01-28 15:28:51
 */
public interface AccountService extends IService<AccountEntity> {

    PageUtils queryPage(Map<String, Object> params);

    AccountEntity getByUserId(Integer userId);
}

