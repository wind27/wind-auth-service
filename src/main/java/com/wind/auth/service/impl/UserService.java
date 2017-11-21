package com.wind.auth.service.impl;

//import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.wind.auth.dao.IUserDao;
import com.wind.auth.dao.impl.LinkUserRoleDao;
import com.wind.auth.mapper.UserMapper;
import com.wind.auth.model.LinkUserRole;
import com.wind.auth.model.User;
import com.wind.auth.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

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
    public User findUsername(String username) {
        return userMapper.findUsername(username);
    }

    @Override
    public boolean save(User user) {
        return userMapper.insert(user)>0;
    }

//    @Override
//    public LinkUserRole save(LinkUserRole linkUserRole) {
//        return linkUserRoleDao.insert(linkUserRole);
//    }

//    @Override
//    public boolean batchSave(List<LinkUserRole> userRoleList) {
//        return linkUserRoleDao.batchInsert(userRoleList);
//    }


}
