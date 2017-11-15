package com.wind.auth.dao;

import com.wind.auth.model.User;
import com.wind.dao.IBaseDao;

import java.util.List;
import java.util.Map;

/**
 *  IUserDao 接口
 */
public interface IUserDao extends IBaseDao<User, Long> {

    public List<User> find(Map<String, Object> params);
    public User findByUsername(String username);
    public User findById(long id);
}
