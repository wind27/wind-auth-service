package com.wind.auth.dao;


import com.wind.auth.model.Role;
import com.wind.dao.IBaseDao;

import java.util.List;

/**
 * IRoleDao
 *
 * @author qianchun 17/7/26
 **/
public interface IRoleDao extends IBaseDao<Role, Long> {
    List<Role> findByUserId(long userId);
}
