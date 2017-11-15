package com.wind.auth.controller;

import com.alibaba.fastjson.JSON;
import com.wind.auth.model.User;
import com.wind.auth.service.IUserService;
import com.wind.common.ErrorCode;
import com.wind.utils.JsonResponseUtil;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 *
 * @author qianchun 17/11/1
 **/
@RestController
public class UserController {
    @Reference
    private IUserService userService;


    @RequestMapping("/user/{id}")
    public String imageShow(Model model, @PathVariable("id") long id) {
        if(id<=0) {
            return JsonResponseUtil.fail(ErrorCode.PARAM_ERROR);
        }
        User user = userService.findById(1);
        if(user==null) {
            return JsonResponseUtil.fail(ErrorCode.PARAM_ERROR);
        }
        return JsonResponseUtil.ok(user);
    }
}
