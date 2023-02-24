package com.example.springjpahibernate.course.jpa;

import com.example.springjpahibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJpaRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public void insert(Course course)
    {
        entityManager.merge(course);
    }

    @Transactional
    public Course findByiD(int id)
    {
        return entityManager.find(Course.class,id);
    }
    @Transactional
    public void deleteById(int id)
    {
        Course course = findByiD(id);
        entityManager.remove(course);
    }

}
