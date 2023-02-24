package com.example.springjpahibernate.course.jdbc;

import com.example.springjpahibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class courseJdbcRepository {
    private static String INSERT_QUERY =
            """
            INSERT INTO COURSE VALUES(?,?,?);
            """;

    private static String DELETE_QUERY =
            """
            DELETE FROM  COURSE WHERE ID=?;
            """;

    private static String SELECT_QUERY =
            """
            SELECT * FROM  COURSE WHERE ID=?;
            """;

    @Autowired
    private  JdbcTemplate JDBCTemplate;
    public void insert(Course course)
    {
        JDBCTemplate.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
    }

    public void delete(int id)
    {
        JDBCTemplate.update(DELETE_QUERY,id);
    }

    public  Course findByID(int id)
    {
        return JDBCTemplate.queryForObject(SELECT_QUERY,new BeanPropertyRowMapper<>(Course.class),id);
    }


}
