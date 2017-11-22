package com.wind.auth.service;

import com.wind.auth.model.Role;

import java.util.List;
import java.util.Map;

/**
 * IRoleService role 服务接口
 *
 * @author qianchun 17/9/18
 **/
public interface IRoleService {

    boolean add(Role app);

    boolean delete(long id);

    boolean update(Role role);

    Role findById(long id);

    List<Role> find(Map<String, Object> params);
}
