package org.example.service;

import jakarta.annotation.Resource;
import org.example.entity.User;
import org.example.exception.CustomException;
import org.example.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private CustomException customException;
    @Resource
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

    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}
