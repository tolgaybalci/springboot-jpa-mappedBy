package com.tolgaybalci.crudexample.service;

import com.tolgaybalci.crudexample.entity.Lesson;

import java.util.List;

public interface ILesson {

    List<Lesson> getAllLesson();

    Lesson getLessonById(long lessonId);

    void saveLesson(Lesson lesson);

    void updateLesson(Lesson lesson);

    void deleteLesson(Long lessonId);
}
