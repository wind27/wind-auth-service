package com.wind.auth.service.impl;

import com.alibaba.dubbo.config.annotation.Service;

import com.wind.auth.dao.IMenuDao;
import com.wind.auth.mapper.MenuMapper;
import com.wind.auth.model.Menu;
import com.wind.auth.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * @author yangying
 * @date 2017/11/10.
 */
@Service(version = "2.0.0")
public class MenuService implements IMenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public Menu findById(long id) {
        return menuMapper.findById(id);
    }


    @Override
    public boolean insert(Menu menu) {
        return menuMapper.insert(menu)>0?true:false;
    }

    @Override
    public boolean delete(Menu menu) {
        return menuMapper.delete(menu)>0?true:false;
    }

    @Override
    public boolean enable(Menu menu ){
        return menuMapper.enable(menu)>0?true:false;
    }

    @Override
    public boolean disable(Menu menu) {
        return menuMapper.disable(menu)>0?true:false;
    }

    @Override
    public boolean update(Menu menu) {
        return menuMapper.update(menu)>0?true:false;
    }

    @Override
    public List<Menu> find(Map<String, Object> params) {
        return menuMapper.find(params);
    }
}

