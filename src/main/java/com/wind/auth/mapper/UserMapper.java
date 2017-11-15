package com.wind.auth.mapper;

import com.wind.auth.model.User;
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
    @Select("select * from user where id = #{id}")
    public User findById(@Param("id") long id);

}
