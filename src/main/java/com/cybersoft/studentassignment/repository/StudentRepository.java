package com.cybersoft.studentassignment.repository;

import com.cybersoft.studentassignment.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
}
