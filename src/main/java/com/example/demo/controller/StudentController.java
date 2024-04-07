package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentServiceImp;
import com.example.demo.service.StudentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
 @Autowired
 StudentServiceImp studentServiceImp;
 @PostMapping("/add")
    public String addStudents(@RequestBody Student student) {
      return studentServiceImp.addStudents(student);
    }
    @GetMapping
    public List<Student> getAllStudents() {
      return studentServiceImp.getAllStudents();
    }
}