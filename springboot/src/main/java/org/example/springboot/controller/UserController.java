package org.example.springboot.controller;

import org.example.springboot.commom.Result;
import org.example.springboot.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

//    @GetMapping
//    public Result selsctAll(){
//        userService.
//        return Result.success();
//    }

}
