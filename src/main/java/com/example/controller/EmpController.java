package com.example.controller;


import com.example.entity.Emp;
import com.example.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("emp")
@RestController
@CrossOrigin
public class EmpController {
   @Resource
    private EmpService empService;
    @RequestMapping("query")
    public List<Emp> query(){
        return  empService.find();
    }
@PostMapping("add")
    public void add(@RequestBody Emp emp){
    System.out.println(emp);
        empService.add(emp);
  }
  @GetMapping("remove")
    public void remove(Integer id){
      System.out.println(id);
        empService.remove(id);
  }
}
