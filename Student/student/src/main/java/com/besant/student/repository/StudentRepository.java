package com.besant.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.besant.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
