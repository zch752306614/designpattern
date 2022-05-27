package com.alice.designpattern.demo.service.impl;

import com.alice.designpattern.demo.entity.User;
import com.alice.designpattern.demo.dao.UserMapper;
import com.alice.designpattern.demo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author ZhangChenhuang
 * @ClassName UserServiceImpl
 * @DateTime 2022/5/27 15:14
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {



}
