package com.example.springbooth2crud.service;

import com.example.springbooth2crud.dto.Student;
import com.example.springbooth2crud.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions;

import java.util.List;

@SpringBootTest
public class StudentServiceTest {

    @Autowired
    private StudentService studentService;

    @Mock
    private StudentRepository studentRepository;

    @Test
    public void findAll() {

        var students = getStudentList();

        Mockito.when(
                studentRepository.findAll()
        ).thenReturn(
                students
        );

        var studentList = studentService.findAll();

        Assertions.assertEquals(students, studentList);

    }

    private List<Student> getStudentList() {
        return List.of(
                Student.builder()
                        .age(13)
                        .firstName("Tahniat")
                        .lastName("Ashraf")
                        .build()
                ,
                Student.builder()
                        .age(22)
                        .firstName("Shorno")
                        .lastName("Joarder")
                        .build()
        );
    }
}
