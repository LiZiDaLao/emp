package com.example;

import com.example.dao.EmpDao;
import com.example.entity.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class EmpApplicationTests {
@Autowired
private EmpDao empDao;
    @Test
    void contextLoads() {
        List<Emp> select = empDao.select();
        for (Emp emp : select) {
            System.out.println(emp);
        }
    }

}
