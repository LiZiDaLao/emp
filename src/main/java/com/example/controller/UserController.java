package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
@CrossOrigin
@RestController
@RequestMapping("user")
public class UserController {
    @Resource
    private UserService userService;
    @PostMapping("login")
    public HashMap<String,Object> login( @RequestBody User user){
        System.out.println(user);
        return userService.login(user);
    }
    @RequestMapping("logout")
    public void logout(String token){

        System.out.println("token："+token);
        System.out.println("根据token到redis中删除用户标识");

    }
}
