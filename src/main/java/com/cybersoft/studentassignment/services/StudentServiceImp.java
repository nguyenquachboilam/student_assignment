package com.cybersoft.studentassignment.services;

import com.cybersoft.studentassignment.entity.StudentEntity;
import com.cybersoft.studentassignment.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {
    @Autowired
    StudentRepository studentRepository;


    @Override
    public List<StudentEntity> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void insertStudent(StudentEntity studentEntity) {
        studentRepository.save(studentEntity);
    }
}
