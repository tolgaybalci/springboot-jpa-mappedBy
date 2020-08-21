package com.tolgaybalci.crudexample.controller;

import com.tolgaybalci.crudexample.dao.UniversityDaoImplementation;
import com.tolgaybalci.crudexample.entity.Lesson;
import com.tolgaybalci.crudexample.entity.University;
import com.tolgaybalci.crudexample.serviceimplementation.UniversityServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/universities")
public class UniversityController {

    @Autowired
    private UniversityServiceImplementation universityServiceImplementation;

    @GetMapping
    public List<University> getAllUniversity(){ return universityServiceImplementation.getAllUniversity(); }

    @PostMapping
    public ResponseEntity<University> saveUniversity(@Validated @RequestBody University university){
        universityServiceImplementation.saveUniversity(university);
        return new ResponseEntity(null, HttpStatus.CREATED);
    }

    @GetMapping("/{universityId}")
    public ResponseEntity<University> getUniversityById(@PathVariable("universityId") Long universityId){
        University university = universityServiceImplementation.getUniversityById(universityId);
        return new ResponseEntity<University>(university, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<University> updateUniversity(@Validated @RequestBody University university){
        universityServiceImplementation.updateUniversity(university);
        return new ResponseEntity<University>(university, HttpStatus.OK);
    }

    @DeleteMapping("/university/{universityId}")
    public ResponseEntity<Void> deleteUniversity(@PathVariable("universityId") Long universityId){
        universityServiceImplementation.deleteUniversity(universityId);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
