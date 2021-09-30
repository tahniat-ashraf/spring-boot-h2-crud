package com.example.springbooth2crud.service;

import com.example.springbooth2crud.dto.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();

    Student addStudent(Student student);
}
