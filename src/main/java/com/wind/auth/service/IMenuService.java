package com.wind.auth.service;

import com.wind.auth.model.Menu;

import java.util.List;
import java.util.Map;

/**
 * @author yangying 2017/11/10.
 */
public interface IMenuService {
    boolean insert(Menu menu);

    boolean delete (long id);

    boolean enable(long id);

    boolean disable(long id);

    Menu findById(long id);

    boolean update(Menu menu);

    List<Menu> find(Map<String, Object> params);
}
