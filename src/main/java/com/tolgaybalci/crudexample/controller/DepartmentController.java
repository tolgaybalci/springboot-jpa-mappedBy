package com.tolgaybalci.crudexample.controller;

import com.tolgaybalci.crudexample.entity.Department;
import com.tolgaybalci.crudexample.serviceimplementation.DepartmentServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentServiceImplementation departmentServiceImplementation;

    @GetMapping
    public List<Department> getAllDepartment(){ return departmentServiceImplementation.getAllDepartment(); }

    @PostMapping
    public ResponseEntity<Department> saveDepartment(@Validated @RequestBody Department department){
        departmentServiceImplementation.saveDepartment(department);
        return new ResponseEntity(null, HttpStatus.CREATED);
    }

    @GetMapping("/{departmentId}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable("departmentId") Long departmentId){
        Department department = departmentServiceImplementation.getDepartmentById(departmentId);
        return new ResponseEntity<Department>(department, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Department> updateDepartment(@Validated @RequestBody Department department){
        departmentServiceImplementation.updateDepartment(department);
        return new ResponseEntity<Department>(department, HttpStatus.OK);
    }

    @DeleteMapping("/department/{departmentId}")
    public ResponseEntity<Void> deleteDepartment(@PathVariable("departmentId") Long departmentId){
        departmentServiceImplementation.deleteDepartment(departmentId);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
