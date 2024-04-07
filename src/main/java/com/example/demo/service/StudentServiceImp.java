package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentServiceInterface{

    @Autowired
    StudentRepository studentRepository;
    @Override
    public String addStudents(Student student) {
       studentRepository.save(student);
        return "Succesful";
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll(Sort.by(Sort.Direction.DESC,"id"));
    }
}
