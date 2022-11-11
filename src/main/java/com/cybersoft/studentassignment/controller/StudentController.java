package com.cybersoft.studentassignment.controller;

import com.cybersoft.studentassignment.entity.StudentEntity;
import com.cybersoft.studentassignment.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/requestparam")
    public ResponseEntity< List<StudentEntity> > getAllStudentsByRequestParam(
            @RequestParam(name = "name") String name,
            @RequestParam(name = "age") int age) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setName(name);
        studentEntity.setAge(age);
        studentService.insertStudent(studentEntity);

        return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK);
    }

    @GetMapping("/pathvariable/{name}/{age}")
    public ResponseEntity< List<StudentEntity> > getAllStudentsByPathVariable(
            @PathVariable("name") String name,
            @PathVariable("age") int age) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setName(name);
        studentEntity.setAge(age);
        studentService.insertStudent(studentEntity);

        return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK);
    }

    @PostMapping("/requestbody")
    public ResponseEntity< List<StudentEntity> > getAllStudentsByRequestBody(@RequestBody StudentEntity studentEntity) {
        studentService.insertStudent(studentEntity);
        return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK);
    }
}
