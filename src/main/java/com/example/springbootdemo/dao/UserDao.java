package com.example.springbootdemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    public String getUser() {
        return "Tanishq";
    }
}
