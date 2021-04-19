package com.tuling.mall.account.controller;

import java.util.Arrays;
import java.util.Map;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tuling.mall.account.entity.AccountEntity;
import com.tuling.mall.account.service.AccountService;
import com.tuling.common.utils.PageUtils;
import com.tuling.common.utils.R;



/**
 * 
 *
 * @author fox
 * @email 2763800211@qq.com
 * @date 2021-01-28 15:28:51
 */
@RestController
@RequestMapping("/account")
@Slf4j
public class AccountController {
    @Autowired
    private AccountService accountService;

    /**
     * 根据用户id获取账户信息
     * @param userId
     * @return
     */
    @RequestMapping("/infoByUserId/{userId}")
    public R infoByUserId(@PathVariable("userId") Integer userId){
        log.info("根据userId:"+userId+"查询账户信息");
        AccountEntity account = accountService.getByUserId(userId);
        return R.ok().put("account", account);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = accountService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		AccountEntity account = accountService.getById(id);

        return R.ok().put("account", account);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody AccountEntity account){
		accountService.save(account);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody AccountEntity account){
		accountService.updateById(account);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		accountService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
