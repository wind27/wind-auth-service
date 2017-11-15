package com.wind.auth.dao;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wind.annotation.DAO;
import com.wind.auth.model.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author yangying
 * @date 2017/11/10.
 */
public interface IMenuDao {
    Menu findMenuById(@Param("id") long id);
}
