package com.wind.auth.controller;

import com.alibaba.fastjson.JSONObject;
import com.wind.auth.model.Menu;
import com.wind.auth.service.IMenuService;
import com.wind.auth.service.IUserService;
import com.wind.common.ErrorCode;
import com.wind.utils.JsonResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    public String list(@RequestParam("ids") ArrayList<Long> ids) {
        Map<String, Object> params = new HashMap<>();
        params.put("ids", ids);
        List<Menu> menuList = menuService.find(params);
        return JsonResponseUtil.ok(menuList);
    }

    @RequestMapping(value = "/menu/add", method = RequestMethod.POST)
    public String add(@RequestParam("menu") Menu menu) {
        if (menu == null) {
            return JsonResponseUtil.fail(ErrorCode.ERROR);
        }
        menuService.insert(menu);
        System.out.print("============================" + JSONObject.toJSONString(menu));
        return JsonResponseUtil.ok();
    }

    @RequestMapping(value = "/menu/delete", method = RequestMethod.DELETE)
    public String delete(@RequestParam("menu") Menu menu) {
        if (menu == null) {
            return JsonResponseUtil.fail(ErrorCode.ERROR);
        }
        menuService.delete(menu.getId());
        System.out.print("----------------" + JSONObject.toJSONString(menu));
        return JsonResponseUtil.ok();
    }

    @RequestMapping(value = "/menu/enable", method = RequestMethod.PUT)
    public String enable(@RequestParam("menu") Menu menu) {
        if (menu == null) {
            return JsonResponseUtil.fail(ErrorCode.ERROR);
        }
         menuService.enable(menu.getId());
        System.out.print("----------------" + JSONObject.toJSONString(menu));
        return JsonResponseUtil.ok();
    }

    @RequestMapping(value = "menu/disable", method = RequestMethod.PUT)
    public String disable(@RequestParam("menu") Menu menu) {
        if (menu == null) {
            return JsonResponseUtil.fail(ErrorCode.ERROR);
        }
       menuService.disable(menu.getId());
        System.out.print("----------------" + JSONObject.toJSONString(menu));
        return JsonResponseUtil.ok();
    }

    @RequestMapping(value = "menu/update", method = RequestMethod.PUT)
    public String update(@RequestParam("menu") Menu menu) {
        if (menu == null) {
            return JsonResponseUtil.fail(ErrorCode.ERROR);
        }
        menuService.update(menu);
        System.out.print("----------------" + JSONObject.toJSONString(menu));
        return JsonResponseUtil.ok(menu);
    }
}
