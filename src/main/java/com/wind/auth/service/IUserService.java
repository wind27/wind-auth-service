package com.wind.auth.service;

import com.wind.auth.model.User;

import java.util.List;
import java.util.Map;

/**
 * IUserService user 服务接口
 *
 * @author qianchun 17/9/18
 **/
public interface IUserService {
    User findByUsername(String username);

    boolean save(User user);

    boolean update(User user);

    User findById(long id);

    List<User> find(Map<String, Object> params);
}
