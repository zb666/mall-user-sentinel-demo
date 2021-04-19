package com.tuling.mall.account.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tuling.common.utils.PageUtils;
import com.tuling.common.utils.Query;

import com.tuling.mall.account.dao.AccountDao;
import com.tuling.mall.account.entity.AccountEntity;
import com.tuling.mall.account.service.AccountService;


@Service("accountService")
public class AccountServiceImpl extends ServiceImpl<AccountDao, AccountEntity> implements AccountService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AccountEntity> page = this.page(
                new Query<AccountEntity>().getPage(params),
                new QueryWrapper<AccountEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public AccountEntity getByUserId(Integer userId) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("user_id",userId);
        AccountEntity accountEntity = baseMapper.selectOne(queryWrapper);
        return accountEntity;
    }

}