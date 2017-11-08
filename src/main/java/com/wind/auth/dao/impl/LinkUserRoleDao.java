package com.wind.auth.dao.impl;

import com.wind.annotation.DAO;
import com.wind.auth.model.LinkUserRole;
import com.wind.dao.impl.BaseDao;
import org.springframework.stereotype.Repository;

/**
 * UserDao
 *
 * @author qianchun 17/7/13
 **/
@DAO(catalog = "wind_auth")
@Repository
public class LinkUserRoleDao extends BaseDao<LinkUserRole, Long> {
    private static final String namespace = LinkUserRole.class.getName();
}
