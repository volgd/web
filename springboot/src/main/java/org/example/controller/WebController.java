package org.example.controller;

import jakarta.annotation.Resource;
import org.example.commom.Result;
import org.example.entity.User;
import org.example.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @Resource
    private UserService userService;

    @GetMapping("/hello")
    public  String hello(){
        return "Hello World";
    }
    @PostMapping("/login")
    public Result login(@RequestBody User user){
        userService.login(user);
        return Result.success();
    }

}
