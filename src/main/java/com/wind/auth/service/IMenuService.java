package com.wind.auth.service;

import com.wind.auth.model.Menu;

import java.util.List;
import java.util.Map;

/**
 * @author yangying
 * @date 2017/11/10.
 */
public interface IMenuService {
    int insert(Menu menu);

    int delete (long id);

    int enable(long id);

    int disable(long id);

    Menu findById(long id);

    int update(Menu menu);

    List<Menu> find(Map<String, Object> params);
}
