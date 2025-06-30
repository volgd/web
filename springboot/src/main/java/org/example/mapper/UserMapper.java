package org.example.mapper;

import org.apache.ibatis.annotations.Select;
import org.example.entity.User;

import java.util.List;

public interface UserMapper {

    @Select("SELECT * FROM `user` WHERE username = #{username}")
    User selectByUsername(String username);


    List<User> selectAll();
}
