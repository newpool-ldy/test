package com.gzsxt.ssm.mapper;

import com.gzsxt.ssm.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Select("select * from user where id = #{id}")
    User selectByPrimaryKey(Integer id);

    @Select("select * from user")
    List<User> selectList();

    @Insert("insert into user(username,password,age values(#{username},#{password},#{age}))")
    int insrt(User user);

    @Update("update user set username = #{username},password = #{password},age = #{age} where id = #{id")
    int updateByPrimaryKey(User user);

    @Delete("delete from user where id = #{id}")
    int deleteByPrimaryKey(Integer id);

    @Select("select * from user where username = #{username} and password = #{password}")
    User selectByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
