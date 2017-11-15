package com.wind.auth.mapper;

import com.wind.auth.model.Menu;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.time.Instant;

/**
 * MenuMapper
 *
 * @author qianchun
 * @date 17/11/15
 **/
//@Mapper
public interface MenuMapper {
    @Select("select * from menu where id = #{id}")
    public Menu findMenuById(@Param("id") long id);

    @Insert("INSERT INTO menu(name,status,app_id,url,create_time,update_time,parent_id) values(#{name},#{status},#{appId},#{url})")
    long addMenuItem(@Param("name") String name, @Param("status") int status, @Param("appId") long appId,
                     @Param("url") String url, @Param("createTime") Instant createTime, @Param("updateTime") Instant updateTime,
                     @Param("parentId") long parentId);

    @Delete("delete from menu where id = #{id}")
    void deleteMenuItem(@Param("id") long id);
}
