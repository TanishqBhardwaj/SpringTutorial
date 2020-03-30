package com.example.springbootdemo.model;

public class MessageResponse {
    public String name;

    public MessageResponse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
