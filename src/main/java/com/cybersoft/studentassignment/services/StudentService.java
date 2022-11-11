package com.cybersoft.studentassignment.services;

import com.cybersoft.studentassignment.entity.StudentEntity;

import java.util.List;

public interface StudentService {
    List<StudentEntity> getAllStudents();
    void insertStudent(StudentEntity studentEntity);
}
