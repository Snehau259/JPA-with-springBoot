package com.example.springjpahibernate.course.SpringDataJpa;

import com.example.springjpahibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository <Course, Integer> {

}
