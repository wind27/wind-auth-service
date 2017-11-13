package com.wind.auth.service;

import com.wind.auth.model.Menu;

/**
 * @author yangying
 * @date 2017/11/10.
 */
public interface IMenuService {
    /**
     * @param id
     * @return
     */
    Menu findMenuItemById(long id);

}
