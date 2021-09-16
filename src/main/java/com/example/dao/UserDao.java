package com.example.dao;

import com.example.entity.User;
import org.springframework.stereotype.Component;
@Compont 
public interface UserDao {
    //查
    User selectUser(String username);

}
