package com.example.demo.mapper;

import com.example.demo.entities.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import javax.websocket.server.PathParam;

/**
 * @author 神隐`
 * 创建时间 2021-07-06 14:51
 */

@Mapper
public interface UserMapper {
    @Select("select id, name, password from tb_user where id = #{id}")
    User getUserById(@PathParam("id") Integer id);

    @Update("update tb_user set name = #{name} where id= #{id}")
    int updateUser(User user);

    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    @Update("insert into tb_user (name,password) values (#{name},#{password} )")
    int insertUser(User user);
}
