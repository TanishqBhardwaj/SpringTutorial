package com.example.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoController {
    private Map<String, Object> result = new HashMap<>();

    @RequestMapping("/demo")
    public Map<String, Object> hello() {
        result.put("name", "Tanishq");
        result.put("city", "Kanpur");
        return result;
    }
}
