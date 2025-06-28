package org.example.springboot.service;

import jdk.jshell.spi.ExecutionControl;
import org.example.springboot.entity.User;
import org.example.springboot.exception.CustomException;
import org.example.springboot.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private CustomException customException;
    private UserMapper userMapper;
    public User login(User user) {
        String username =user.getUsername();
        User dbuser =userMapper.selectByUsername(username);
        if(dbuser==null){
            throw new CustomException("500","账号不存在");
        }
        String password =user.getPassword();
        if(!dbuser.getPassword().equals(password)){
            throw new CustomException("500","账号或密码错误");
        }
        return dbuser;
    }
}
