package com.wind.auth.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wind.auth.dao.MenuDAO;
import com.wind.auth.model.Menu;
import com.wind.auth.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author yangying
 * @date 2017/11/10.
 */
@Service
public class MenuService implements IMenuService {

//    @Autowired
//    private MenuDAO menuDAO;

    @Override
    public Menu findMenuItemById(long id) {
//        return menuDAO.findMenuById(id);
        return null;
    }
}

