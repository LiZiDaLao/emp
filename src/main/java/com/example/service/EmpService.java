package com.example.service;


import com.example.entity.Emp;

import java.util.List;

public interface EmpService {
    //查
    List<Emp> find();
    //删
    void remove(Integer id);
    //增
    void add(Emp emp);
    //改
    void change(Emp emp);
}
