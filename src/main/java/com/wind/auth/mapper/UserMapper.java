package com.wind.auth.mapper;

import com.wind.auth.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.SqlSessionFactory;

/**
 * UserMapper
 *
 * @author qianchun 17/11/15
 **/
@Mapper
public interface UserMapper {
    String SELECT_COLUMNS = "SELECT id,username,realname, salt, password,status,create_time, update_time, mobile, idcard, email  FROM user where 1=1 ";

    String SELECT_COLUMNS_WITHOUT_PASSWORD = "SELECT id,username,realname, salt,status,create_time, update_time, mobile, idcard, email  FROM user where 1=1 ";

    String INSERT_COLUMNS = " INSERT INTO user(username, realname, salt, password, status, create_time, update_time, mobile, idcard, email) VALUES  ";

    @Insert(INSERT_COLUMNS+"(#{user.username}, #{user.realname}, #{user.salt}, #{user.password}, #{user.status}, now(), now(), #{user.mobile}, #{user.idcard}, #{user.email})")
    public int insert(@Param("user") User user);

    @Select(SELECT_COLUMNS_WITHOUT_PASSWORD+"and id = #{id} limit 0, 1")
    public User findById(@Param("id") long id);

    @Select(SELECT_COLUMNS+"and username = #{username} limit 0, 1")
    public User findByUsername(@Param("username") String username);
}
