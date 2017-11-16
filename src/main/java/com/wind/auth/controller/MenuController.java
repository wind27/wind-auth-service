package com.wind.auth.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wind.auth.model.Menu;
import com.wind.auth.service.IMenuService;
import com.wind.auth.service.IUserService;
import com.wind.common.ErrorCode;
import com.wind.utils.JsonResponseUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yangying
 * @date 2017/11/10.
 */
@RestController
public class MenuController {
    @Autowired
    private IMenuService menuService;

    @Autowired
    private IUserService userService;

    @RequestMapping("/menu/{id}")
    public String detail(@PathVariable("id") long id) {
        Menu menu = menuService.findById(id);
        return JsonResponseUtil.ok(menu);
    }

    @RequestMapping("/menu/list")
    public String list(@Param("ids") List<Long> ids) {
        Map<String, Object> params = new HashMap<>();
        params.put("ids", ids);
        List<Menu> menuList = menuService.find(params);
        return JsonResponseUtil.ok(menuList);
    }

    @RequestMapping(value = "/menu/add", method = RequestMethod.POST)
    public String add(@Param("menu") Menu menu) {
        if (menu != null) {
            int id = menuService.insert(menu);
            System.out.print("============================"+ JSONObject.toJSONString(menu));
            return JsonResponseUtil.ok();
        }
        return JsonResponseUtil.fail(ErrorCode.ERROR);
    }

    public String delete(@Param("id") int id ){
        return null;
    }

}
