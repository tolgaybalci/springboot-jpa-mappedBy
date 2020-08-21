package com.tolgaybalci.crudexample.service;

import com.tolgaybalci.crudexample.entity.Department;

import java.util.List;

public interface IDepartment {

    List<Department> getAllDepartment();

    Department getDepartmentById(Long departmentId);

    void saveDepartment(Department department);

    void updateDepartment(Department department);

    void deleteDepartment(Long departmentId);
}
