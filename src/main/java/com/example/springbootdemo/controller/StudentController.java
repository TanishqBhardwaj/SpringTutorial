package com.example.springbootdemo.controller;

import com.example.springbootdemo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    @RequestMapping("/list")
    public String list(Model model) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1813021, "Tanishq", 67.0));
        list.add(new Student(1813024, "Utkarsh", 60.0));
        model.addAttribute("list", list);

        double grade = 75;
        model.addAttribute("grade", grade);
        model.addAttribute("GPA", convertGPA(grade));
        return "list";
    }

    public String convertGPA(double grade) {
        if(grade>=90) {
            return "A";
        }
        else if(grade>=80) {
            return  "B";
        }
        else if(grade>=70) {
            return  "C";
        }
        else if(grade>=60) {
            return  "D";
        }
        else {
            return "F";
        }
    }
}
