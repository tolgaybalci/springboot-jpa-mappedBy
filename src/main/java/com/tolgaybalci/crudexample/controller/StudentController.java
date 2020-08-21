package com.tolgaybalci.crudexample.controller;

import com.tolgaybalci.crudexample.entity.Lesson;
import com.tolgaybalci.crudexample.entity.Student;
import com.tolgaybalci.crudexample.serviceimplementation.StudentServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentServiceImplementation studentServiceImplementation;

    @GetMapping
    public List<Student> getAllStudent(){ return studentServiceImplementation.getAllStudent(); }

    @PostMapping
    public ResponseEntity<Student> saveStudent(@Validated @RequestBody Student student){
        studentServiceImplementation.saveStudent(student);
        return new ResponseEntity(null, HttpStatus.CREATED);
    }

    @GetMapping("/{studentId}")
    public ResponseEntity<Student> getStudentById(@PathVariable("studentId") Long studentId){
        Student student = studentServiceImplementation.getStudentById(studentId);
        return new ResponseEntity<Student>(student, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Student> updateStudent(@Validated @RequestBody Student student){
        studentServiceImplementation.updateStudent(student);
        return new ResponseEntity<Student>(student, HttpStatus.OK);
    }

    @DeleteMapping("/student/{studentId}")
    public ResponseEntity<Void> deleteStudent(@PathVariable("studentId") Long studentId){
        studentServiceImplementation.deleteStudent(studentId);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
