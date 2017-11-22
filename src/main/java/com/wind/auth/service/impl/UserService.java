package com.wind.auth.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wind.auth.mapper.UserMapper;
import com.wind.auth.model.User;
import com.wind.auth.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * UserService
 *
 * @author qianchun 17/9/18
 **/
@Service(version = "2.0.0")
public class UserService implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(long id) {
        return userMapper.findById(id);
    }

    @Override
    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }

    @Override
    public boolean save(User user) {
        return userMapper.insert(user)>0;
    }

    @Override
    public List<User> find(Map<String, Object> params) {
        return userMapper.find(params);
    }

    @Override
    public boolean update(User user) {
        return userMapper.update(user)>0;
    }
}
