package com.example.demo.service;

import com.example.demo.model.Student;

import java.util.List;

public interface StudentServiceInterface {
    public String addStudents(Student student);
    public List<Student> getAllStudents();
}
