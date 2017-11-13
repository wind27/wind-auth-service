package com.wind.auth.service.impl;

//import com.alibaba.dubbo.config.annotation.Service;
import com.wind.auth.dao.IUserDao;
import com.wind.auth.dao.impl.LinkUserRoleDao;
import com.wind.auth.model.LinkUserRole;
import com.wind.auth.model.User;
import com.wind.auth.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserService
 *
 * @author qianchun 17/9/18
 **/
@Service
public class UserService implements IUserService {
    @Autowired
    private IUserDao userDao;

    @Autowired
    private LinkUserRoleDao linkUserRoleDao;

    @Override
    public User findById(long id) {
        return userDao.findById(id);
    }

    @Override
    public User save(User user) {
        return userDao.insert(user);
    }

    @Override
    public LinkUserRole save(LinkUserRole linkUserRole) {
        return linkUserRoleDao.insert(linkUserRole);
    }

    @Override
    public boolean batchSave(List<LinkUserRole> userRoleList) {
        return linkUserRoleDao.batchInsert(userRoleList);
    }


}
