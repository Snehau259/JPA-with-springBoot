//package com.example.springjpahibernate.course.jdbc;
package com.example.springjpahibernate.course;
//import com.example.springjpahibernate.course.jpa;
import com.example.springjpahibernate.course.SpringDataJpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private courseJdbcRepository JdbcRepository;

//    @Autowired
//    private CourseJpaRepository jpaRepository;

    @Autowired
    private CourseSpringDataJpaRepository springDataJpaRepository;
    @Override
    public void run(String... args) throws Exception {
        springDataJpaRepository.save(new Course(1,"Learn GCP","Ranga Karanam"));
        springDataJpaRepository.save(new Course(2,"Learn AWS","Ranga Karanam"));
        springDataJpaRepository.save(new Course(3,"Learn DEVOPS","Ranga Karanam"));
        springDataJpaRepository.save(new Course(4,"Learn SPRINGBOOT","Ranga Karanam"));
        springDataJpaRepository.save(new Course(5,"Learn FLUTTER","Ranga Karanam"));
        springDataJpaRepository.deleteById(1);
        System.out.println(springDataJpaRepository.findById(2));
        System.out.println( springDataJpaRepository.findById(3));
    }
}
