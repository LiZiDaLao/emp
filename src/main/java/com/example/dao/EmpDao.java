package com.example.dao;


import com.example.entity.Emp;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EmpDao {
    //查
    List<Emp> select();
    //删
    void delete(Integer id);
    //增
    void insert(Emp emp);
    //改
    void update(Emp emp);
}
