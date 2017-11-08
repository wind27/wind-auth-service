package com.wind.auth.dao.impl;

import com.wind.annotation.DAO;
import com.wind.auth.dao.IPermissionDao;
import com.wind.auth.model.Permission;
import com.wind.dao.impl.BaseDao;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * PermissionDao
 *
 * @author qianchun 17/7/13
 **/
@DAO(catalog = "wind_auth")
@Repository
public class PermissionDao extends BaseDao<Permission, Long> implements IPermissionDao {
    private static final String namespace = Permission.class.getName();

    public List<Permission> findByRoleId(long roleId) {
        return super.getSqlSession().selectList(namespace+".findByRoleId", roleId);
    }

    public List<Permission> findByUserId(long roleId) {
        return super.getSqlSession().selectList(namespace+".findByUserId", roleId);
    }

    public List<Permission> findByRoleIds(List<Long> roleIds) {
        return super.getSqlSession().selectList(namespace+".findByRoleIds", roleIds);
    }
}
