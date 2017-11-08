package com.wind.auth.dao;



import com.wind.auth.model.Permission;
import com.wind.dao.IBaseDao;

import java.util.List;

/**
 * IPermissionDao
 *
 * @author qianchun 17/7/26
 **/
public interface IPermissionDao extends IBaseDao<Permission, Long> {
    List<Permission> findByRoleIds(List<Long> roleIds);
    List<Permission> findByRoleId(long roleId);
    List<Permission> findByUserId(long roleId);
}
