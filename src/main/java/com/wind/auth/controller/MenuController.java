package com.wind.auth.controller;

import com.alibaba.fastjson.JSON;
import com.wind.auth.model.User;
import com.wind.auth.service.IMenuService;
import com.wind.auth.service.IUserService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangying
 * @date 2017/11/10.
 */
@RestController
public class MenuController {

    @Reference
    private IMenuService menuService;

    @Reference
    private IUserService userService;

    @RequestMapping("/menu")
    public String findMenuItemById(@Param("id") long id) {

        return null;
    }


}
