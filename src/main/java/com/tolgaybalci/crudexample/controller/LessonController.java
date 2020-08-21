package com.tolgaybalci.crudexample.controller;

import com.tolgaybalci.crudexample.entity.Department;
import com.tolgaybalci.crudexample.entity.Lesson;
import com.tolgaybalci.crudexample.serviceimplementation.DepartmentServiceImplementation;
import com.tolgaybalci.crudexample.serviceimplementation.LessonServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lessons")
public class LessonController {

    @Autowired
    private LessonServiceImplementation lessonServiceImplementation;

    @GetMapping
    public List<Lesson> getAllLesson(){ return lessonServiceImplementation.getAllLesson(); }

    @PostMapping
    public ResponseEntity<Lesson> saveLesson(@Validated @RequestBody Lesson lesson){
        lessonServiceImplementation.saveLesson(lesson);
        return new ResponseEntity(null, HttpStatus.CREATED);
    }

    @GetMapping("/{lessonId}")
    public ResponseEntity<Lesson> getLessonById(@PathVariable("lessonId") Long lessonId){
        Lesson lesson = lessonServiceImplementation.getLessonById(lessonId);
        return new ResponseEntity<Lesson>(lesson, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Lesson> updateLesson(@Validated @RequestBody Lesson lesson){
        lessonServiceImplementation.updateLesson(lesson);
        return new ResponseEntity<Lesson>(lesson, HttpStatus.OK);
    }

    @DeleteMapping("/lesson/{lessonId}")
    public ResponseEntity<Void> deleteLesson(@PathVariable("lessonId") Long lessonId){
        lessonServiceImplementation.deleteLesson(lessonId);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
