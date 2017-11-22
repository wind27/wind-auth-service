package com.wind.auth.mapper;

import com.wind.auth.model.Role;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * RoleMapper
 *
 * @author qianchun 17/11/15
 **/
@Mapper
public interface RoleMapper {
    String SELECT_COLUMNS = "SELECT id, name, status, create_time, update_time FROM role WHERE 1=1 ";

    String INSERT_COLUMNS = " INSERT INTO role(name, status, create_time, update_time) VALUES  ";

    @Insert(INSERT_COLUMNS + "(#{role.name}, #{role.status}, now(), now())")
    int insert(@Param("role") Role role);

    @Delete("DELETE FROM role where id = #{id}")
    int delete(@Param("id") long id);

    @Select(SELECT_COLUMNS + "AND id = #{id} limit 0, 1")
    Role findById(@Param("id") long id);

    @Select("<script>" + SELECT_COLUMNS + "<when test='params.status!=null'> AND status = #{params.status}</when>"
            + "</script>")
    List<Role> find(@Param("params") Map<String, Object> params);

    @Update("UPDATE role SET name=#{role.name}, status=#{role.status}, update_time=now() WHERE id = #{role.id}")
    int update(@Param("role") Role role);
}
