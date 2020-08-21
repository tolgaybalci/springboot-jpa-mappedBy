package com.tolgaybalci.crudexample.serviceimplementation;

import com.tolgaybalci.crudexample.dao.LessonDaoImplementation;
import com.tolgaybalci.crudexample.entity.Lesson;
import com.tolgaybalci.crudexample.service.ILesson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonServiceImplementation implements ILesson {

    @Autowired
    private LessonDaoImplementation lessonDaoImplementation;

    @Override
    public List<Lesson> getAllLesson() {
        return lessonDaoImplementation.getAllLesson();
    }

    @Override
    public Lesson getLessonById(long lessonId) {
        return lessonDaoImplementation.getLessonById(lessonId);
    }

    @Override
    public void saveLesson(Lesson lesson) {
        lessonDaoImplementation.saveLesson(lesson);
    }

    @Override
    public void updateLesson(Lesson lesson) {
        lessonDaoImplementation.updateLesson(lesson);
    }

    @Override
    public void deleteLesson(Long lessonId) {
        lessonDaoImplementation.deleteLesson(lessonId);
    }
}
