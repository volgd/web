package org.example.controller;

import jakarta.annotation.Resource;
import org.example.commom.Result;
import org.example.entity.User;
import org.example.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/selectAll")
    public Result selectAll(){
        List< User > list = userService.selectAll();
        return Result.success(list);
    }

}
