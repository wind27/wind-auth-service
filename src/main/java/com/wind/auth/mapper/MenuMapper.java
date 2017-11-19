package com.wind.auth.mapper;

import com.wind.auth.model.Menu;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;
import java.util.Map;

/**
 * MenuMapper
 *
 * @author qianchun
 * @date 17/11/15
 **/
@Mapper
public interface MenuMapper {

    String SELECT_COLUMNS = "SELECT id,name,status,app_id,url,create_time,update_time,parent_id FROM menu where 1=1 ";

    String INSERT_COLUMNS = " INSERT INTO menu(name,status,app_id,url,create_time,update_time,parent_id) VALUES  ";

    @Select(SELECT_COLUMNS + " and id = #{id}")
    Menu findById(@Param("id") long id);

    @Select(SELECT_COLUMNS + " and id = #{menu.id}")
    List<Menu> findList(@Param("menu") Menu menu);

    @Insert(INSERT_COLUMNS + "(#{menu.name},1,#{menu.appId},#{menu.url},now(),now(),#{menu.parentId})")
    @Options(useGeneratedKeys = true, keyProperty = "menu.id")
    int insert(@Param("menu") Menu menu);

    @Delete("delete from menu where id = #{id}")
    int delete(@Param("id") long id);

    @Update("update menu set status=1 where id = #{id}")
    int enable(@Param("id") long id);

    @Update("update menu set status=0 where id = #{id}")
    int disable(@Param("id") long id);

    @Update("update menu set name = #{menu.name} where id = #{menu.id}")
    int update(@Param("menu") Menu menu);

    @Select("<script>"+SELECT_COLUMNS
//            + "<when test='${params.ids!=null}'> AND id = #{params.ids}</when>"
            + "<when test='params.status!=null'> AND status = #{params.status}</when>"+"</script>")
    List<Menu> find(@Param("params") Map<String, Object> params);
}
