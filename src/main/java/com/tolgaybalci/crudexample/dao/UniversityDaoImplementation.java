package com.tolgaybalci.crudexample.dao;

import com.tolgaybalci.crudexample.entity.University;
import com.tolgaybalci.crudexample.repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UniversityDaoImplementation {

    @Autowired
    private UniversityRepository universityRepository;

    public List<University> getAllUniversity() {
        return universityRepository.findAll();
    }

    public void saveUniversity(University university) {
        universityRepository.save(university);
    }

    public University getUniversityById(Long universityId) {
        return universityRepository.findById(universityId).orElse(null);
    }

    public void updateUniversity(University university) {
        universityRepository.save(university);
    }

    public void deleteUniversity(Long universityId) {
        universityRepository.delete(universityRepository.getOne(universityId));
    }
}
