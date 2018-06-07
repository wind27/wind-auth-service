package com.wind.auth.mapper;

import com.wind.auth.model.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

@Mapper
public interface MenuMapperEx extends MenuMapper {
    String COLUMN = " id, name, status, app_id, url, create_time, update_time, parent_id ";

    @Select("select " + COLUMN + " from menu " + "where 1=1 " + "<if test='id!=null'> and id = #{id}"
            + "<if test='name!=null'> and name = #{name}" + "<if test='status!=null'> and status = #{status}"
            + "<if test='appId!=null'> and app_id = #{appId}" + "<if test='url!=null'> and url = #{url}"
            + "<if test='parentId!=null'> and parent_id = #{parentId}"
            + "<if test='start!=null and size!=null'> limit #{start}, #{size}"
            + "<if test='orderByStr!=null'> order by #{orderByStr} desc")
    List<Menu> find(Map<String, Object> params);


    @Update("update menu set status = #{status} where id = #{id}")
    int updateStatus(long id, int status);
}