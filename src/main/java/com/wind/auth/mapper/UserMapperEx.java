package com.wind.auth.mapper;

import com.wind.auth.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapperEx extends UserMapper{
    String COLUMN = " id, username, realname, salt, password, status, create_time, update_time, mobile, idcard, email ";

    @Select("select " + COLUMN + " from user " +
            "where 1=1 " +
            "<if test='username!=null'> and username = #{username}" +
            "<if test='mobile!=null'> and mobile = #{mobile}" +
            "<if test='status!=null'> and status = #{status}" +
            "<if test='realname!=null'> and realname = #{realname}" +
            "<if test='email!=null'> and email = #{email}" +
            "<if test='idcard!=null'> and idcard = #{idcard}" +
            "<if test='start!=null and size!=null'> limit #{start}, #{size}" +
            "<if test='orderByStr!=null'> order by #{orderByStr} desc"
    )
    List<User> selectByMap(Map<String, Object> params);

    @Select("select " + COLUMN + " from user " +
            "where username = #{username} and status = 1 limit 0,1"
    )
    User selectByUsername(String username);
}