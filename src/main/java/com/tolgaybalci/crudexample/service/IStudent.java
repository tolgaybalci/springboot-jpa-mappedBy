package com.tolgaybalci.crudexample.service;

import com.tolgaybalci.crudexample.entity.Student;

import java.util.List;

public interface IStudent {

    List<Student> getAllStudent();

    Student getStudentById(Long studentId);

    void saveStudent(Student student);

    void updateStudent(Student student);

    void deleteStudent(Long studentId);
}
