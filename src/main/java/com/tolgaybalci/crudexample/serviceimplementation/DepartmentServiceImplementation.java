package com.tolgaybalci.crudexample.serviceimplementation;

import com.tolgaybalci.crudexample.dao.DepartmentDaoImplementation;
import com.tolgaybalci.crudexample.entity.Department;
import com.tolgaybalci.crudexample.service.IDepartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImplementation implements IDepartment {

    @Autowired
    private DepartmentDaoImplementation departmentDaoImplementation;

    @Override
    public List<Department> getAllDepartment() {
        return departmentDaoImplementation.getAllDepartment();
    }

    @Override
    public Department getDepartmentById(Long departmentId) {
        return departmentDaoImplementation.getDepartmentById(departmentId);
    }

    @Override
    public void saveDepartment(Department department) {
        departmentDaoImplementation.saveDepartment(department);
    }

    @Override
    public void updateDepartment(Department department) {
        departmentDaoImplementation.updateDepartment(department);
    }

    @Override
    public void deleteDepartment(Long departmentId) {
        departmentDaoImplementation.deleteDepartment(departmentId);
    }
}
