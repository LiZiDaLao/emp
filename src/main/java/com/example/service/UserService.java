package com.example.service;

import com.example.entity.User;

import java.util.HashMap;

public interface UserService {
        HashMap<String, Object> login(User user);
}
