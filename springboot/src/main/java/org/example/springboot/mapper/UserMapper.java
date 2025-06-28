package org.example.springboot.mapper;

import org.apache.ibatis.annotations.Select;
import org.example.springboot.entity.User;

public interface UserMapper {

    @Select("select * from `user` where username = #{username}")
    User selectByUsername(String username);


}
