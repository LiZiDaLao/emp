package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public HashMap<String, Object> login(User user) {
        User user1=userDao.selectUser(user.getUsername());
        HashMap<String, Object> map = new HashMap<>();
        System.out.println(user1);
        //存入redis
        if(user1!=null){
            if(user1.getPassword().equals(user.getPassword())){
                //将用户数据存入session   redis  k=token(uuid),value(用户数据)
                map.put("message",user1);
                map.put("status",200);
            }else{
                map.put("message","密码不正确！！！");
                map.put("status",401);
            }
        }else{
            map.put("message","该用户不存在！！！");
            map.put("status",401);
        }
        return map;
    }
}
