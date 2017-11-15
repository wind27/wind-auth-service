package com.wind.auth.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

import com.wind.auth.dao.IMenuDao;
import com.wind.auth.model.Menu;
import com.wind.auth.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author yangying
 * @date 2017/11/10.
 */
@Service
public class MenuService implements IMenuService {

    @Autowired
    private IMenuDao menuDao;

    @Override
    public Menu findMenuItemById(long id) {
        return menuDao.findMenuById(id);
    }
}

