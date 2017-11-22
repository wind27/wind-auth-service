package com.wind.auth.mapper;

import com.wind.auth.model.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;
import java.util.Map;

/**
 * UserMapper
 *
 * @author qianchun 17/11/15
 **/
@Mapper
public interface UserMapper {
    String SELECT_COLUMNS = "SELECT id,username,realname, salt, password,status,create_time, update_time, mobile, idcard, email  FROM user WHERE 1=1 ";

    String SELECT_COLUMNS_WITHOUT_PASSWORD = "SELECT id,username,realname, salt,status,create_time, update_time, mobile, idcard, email  FROM user WHERE 1=1 ";

    String INSERT_COLUMNS = " INSERT INTO user(username, realname, salt, password, status, create_time, update_time, mobile, idcard, email) VALUES  ";

    @Insert(INSERT_COLUMNS+"(#{user.username}, #{user.realname}, #{user.salt}, #{user.password}, #{user.status}, now(), now(), #{user.mobile}, #{user.idcard}, #{user.email})")
    int insert(@Param("user") User user);

    @Select(SELECT_COLUMNS_WITHOUT_PASSWORD+"AND id = #{id} limit 0, 1")
    User findById(@Param("id") long id);

    @Select(SELECT_COLUMNS+"AND username = #{username} limit 0, 1")
    User findByUsername(@Param("username") String username);


    @Select("<script>"+SELECT_COLUMNS_WITHOUT_PASSWORD
            + "<when test='params.status!=null'> AND status = #{params.status}</when>"+"</script>")
    List<User> find(@Param("params") Map<String, Object> params);

    @Update("UPDATE user SET realname=#{user.realname}, email=#{user.email}, mobile=#{user.mobile}, status=#{user.status} update_time=now() WHERE id = #{user.id}")
    int update(@Param("user") User user);
}
