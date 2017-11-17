package com.wind.auth.service;

import com.wind.auth.model.Menu;

import java.util.List;
import java.util.Map;

/**
 * @author yangying
 * @date 2017/11/10.
 */
public interface IMenuService {
    boolean insert(Menu menu);

    boolean delete (Menu menu);

    boolean enable(Menu menu);

    boolean disable(Menu menu);

    Menu findById(long id);

    boolean update(Menu menu);

    List<Menu> find(Map<String, Object> params);
}
