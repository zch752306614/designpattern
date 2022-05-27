package com.alice.designpattern.demo.dao;

import com.alice.designpattern.demo.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description TODO
 * @Author ZhangChenhuang
 * @ClassName UserMapper
 * @DateTime 2022/5/27 15:43
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {



}
