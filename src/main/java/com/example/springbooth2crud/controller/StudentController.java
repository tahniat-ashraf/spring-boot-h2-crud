package com.example.springbooth2crud.controller;


import com.example.springbooth2crud.dto.Student;
import com.example.springbooth2crud.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    private ResponseEntity<List<Student>> getStudentList() {

        var studentList = studentService.findAll();
        return new ResponseEntity<>(studentList, HttpStatus.OK);

    }

    @PostMapping
    private ResponseEntity<Student> addStudent(@RequestBody Student student) {


        Student student1 = studentService.addStudent(student);

        return new ResponseEntity<>(student1, HttpStatus.CREATED);
    }
}
