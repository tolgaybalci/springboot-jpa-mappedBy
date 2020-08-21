package com.tolgaybalci.crudexample.serviceimplementation;

import com.tolgaybalci.crudexample.dao.UniversityDaoImplementation;
import com.tolgaybalci.crudexample.entity.University;
import com.tolgaybalci.crudexample.service.IUniversity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityServiceImplementation implements IUniversity {

    @Autowired
    private UniversityDaoImplementation universityDaoImplementation;

    @Override
    public List<University> getAllUniversity() {
        return universityDaoImplementation.getAllUniversity();
    }

    @Override
    public University getUniversityById(Long universityId) {
        return universityDaoImplementation.getUniversityById(universityId);
    }

     @Override
    public void saveUniversity(University university) {
        universityDaoImplementation.saveUniversity(university);
    }

    @Override
    public void updateUniversity(University university) {
        universityDaoImplementation.updateUniversity(university);
    }

    @Override
    public void deleteUniversity(Long univeristyId) {
        universityDaoImplementation.deleteUniversity(univeristyId);
    }
}

