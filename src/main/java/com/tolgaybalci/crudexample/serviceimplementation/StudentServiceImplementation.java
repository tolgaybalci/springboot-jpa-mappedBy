package com.tolgaybalci.crudexample.serviceimplementation;

import com.tolgaybalci.crudexample.dao.StudentDaoImplementation;
import com.tolgaybalci.crudexample.entity.Student;
import com.tolgaybalci.crudexample.service.IStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplementation implements IStudent {

    @Autowired
    private StudentDaoImplementation studentDaoImplementation;

    @Override
    public List<Student> getAllStudent() {
        return studentDaoImplementation.getAllStudent();
    }

    @Override
    public Student getStudentById(Long studentId) {
        return studentDaoImplementation.getStudentById(studentId);
    }

    @Override
    public void saveStudent(Student student) {
        studentDaoImplementation.saveStudent(student);
    }

    @Override
    public void updateStudent(Student student) {
        studentDaoImplementation.updateStudent(student);
    }

    @Override
    public void deleteStudent(Long studentId) {
        studentDaoImplementation.deleteStudent(studentId);
    }
}
