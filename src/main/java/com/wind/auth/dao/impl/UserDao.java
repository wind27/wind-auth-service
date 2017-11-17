package com.wind.auth.dao.impl;

import com.wind.annotation.DAO;
import com.wind.auth.dao.IUserDao;
import com.wind.auth.mapper.UserMapper;
import com.wind.auth.model.User;
import com.wind.dao.impl.BaseDao;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * UserDao
 *
 * @author qianchun 17/7/13
 **/
@DAO(catalog = "wind_auth")
public class UserDao extends BaseDao<User, Long> implements IUserDao {
    private static final String namespace = User.class.getName();

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> find(Map<String, Object> params) {
        return null;
    }

    @Override
    public User findByUsername(String username) {
        return super.getSqlSession().selectOne(namespace+".findByUsername", username);
    }

    public User findById(long id) {

        SqlSession sqlSession = getSqlSession();
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.findById(id);
        System.out.println(userMapper.findById(id));
        return user;
//        return null;
    }
}
