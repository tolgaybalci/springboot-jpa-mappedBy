package com.tolgaybalci.crudexample.dao;

import com.tolgaybalci.crudexample.entity.Lesson;
import com.tolgaybalci.crudexample.repository.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LessonDaoImplementation {

    @Autowired
    private LessonRepository lessonRepository;

    public List<Lesson> getAllLesson() {
        return lessonRepository.findAll();
    }

    public void saveLesson(Lesson lesson) {
        lessonRepository.save(lesson);
    }

    public Lesson getLessonById(Long lessonId) {
        return lessonRepository.findById(lessonId).orElse(null);
    }

    public void updateLesson(Lesson lesson) {
        lessonRepository.save(lesson);
    }

    public void deleteLesson(Long lessonId) {
        lessonRepository.delete(lessonRepository.getOne(lessonId));
    }
}
