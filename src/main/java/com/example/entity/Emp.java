package com.example.entity;


import lombok.Data;

import java.util.Date;

@Data
public class Emp {
    private Integer id;
    private String name;
    private Double salary;
    private Date birthday;
}
