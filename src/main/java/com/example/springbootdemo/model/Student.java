package com.example.springbootdemo.model;

public class Student {
    public int rollNo;
    public String name;
    public double grade;

    public Student(int rollNo, String name, double grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.grade = grade;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}