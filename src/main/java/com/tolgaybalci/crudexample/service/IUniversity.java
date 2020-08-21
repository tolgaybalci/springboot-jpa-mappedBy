package com.tolgaybalci.crudexample.service;

import com.tolgaybalci.crudexample.entity.University;

import java.util.List;

public interface IUniversity {

    List<University> getAllUniversity();

    University getUniversityById(Long universityId);

    void saveUniversity(University university);

    void updateUniversity(University university);

    void deleteUniversity(Long universityId);
}
