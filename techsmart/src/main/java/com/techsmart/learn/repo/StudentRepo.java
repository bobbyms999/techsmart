package com.techsmart.learn.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techsmart.learn.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
