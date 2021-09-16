package com.example.service.impl;


import com.example.dao.EmpDao;
import com.example.entity.Emp;
import com.example.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpDao empDao;

    @Override
    public List<Emp> find() {

        return empDao.select();
    }

    @Override
    public void remove(Integer id) {
        empDao.delete(id);
    }

    @Override
    public void add(Emp emp) {
     empDao.insert(emp);
    }

    @Override
    public void change(Emp emp) {
     empDao.update(emp);
    }
}
