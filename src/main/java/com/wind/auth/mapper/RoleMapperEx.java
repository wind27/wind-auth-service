package com.wind.auth.mapper;

import com.wind.auth.model.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface RoleMapperEx extends RoleMapper{
    @Select("select " +
            "id, name, status, create_time, update_time " +
            "from role " +
            "where 1=1 " +
            "<if test='id!=null'> and id = #{id}" +
            "<if test='name!=null'> and name like %#{name}%" +
            "<if test='status!=null'> and status = #{status}" +
            "<if test='start!=null and size!=null'> limit #{start}, #{size}" +
            "<if test='orderByStr!=null'> order by #{orderByStr} desc"
    )
    List<Role> selectByMap(Map<String, Object> params);
}