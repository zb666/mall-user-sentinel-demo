package com.tuling.mall.user.mapper;


import com.tuling.mall.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user")
    List<User> list();

    @Select("select * from user where id=#{id}")
    User getById(Integer id);
}