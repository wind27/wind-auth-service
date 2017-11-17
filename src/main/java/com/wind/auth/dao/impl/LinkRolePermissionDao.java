package com.wind.auth.dao.impl;

import com.wind.annotation.DAO;
import com.wind.auth.model.LinkRolePermission;
import com.wind.dao.impl.BaseDao;
import org.springframework.stereotype.Repository;

/**
 * RolePermissionDao
 *
 * @author qianchun 17/7/13
 **/
@DAO(catalog = "wind_auth")
public class LinkRolePermissionDao extends BaseDao<LinkRolePermissionDao, Long> {
    private static final String namespace = LinkRolePermission.class.getName();
}
