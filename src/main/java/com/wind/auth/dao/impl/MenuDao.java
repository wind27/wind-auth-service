package com.wind.auth.dao.impl;

import com.wind.annotation.DAO;
import com.wind.auth.dao.IMenuDao;
import com.wind.auth.mapper.MenuMapper;
import com.wind.auth.mapper.UserMapper;
import com.wind.auth.model.Menu;
import com.wind.auth.model.User;
import com.wind.dao.impl.BaseDao;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * MenuDao
 *
 * @author qianchun
 * @date 17/11/15
 **/
@DAO(catalog = "wind_auth")
public class MenuDao extends BaseDao<Menu, Long> implements IMenuDao {
    @Override
    public Menu findMenuById(@Param("id") long id) {
         MenuMapper menuMapper = getSqlSession().getMapper(MenuMapper.class);
//         return menuMapper.findById(id);

        return null;
    }
}
