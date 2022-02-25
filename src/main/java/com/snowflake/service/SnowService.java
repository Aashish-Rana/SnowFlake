package com.snowflake.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.snowflake.modal.Student;
import com.snowflake.repo.SnowRepo;

@Service
public class SnowService implements SnowRepo{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	
	
	@Override
	public List<Student> findByAll() {
		return jdbcTemplate.query(
                "select * from STUDENT",
                (rs, rowNum) ->
                        new Student(
                                rs.getInt("studentId"),
                                rs.getString("studentName"),
                                rs.getString("classId")
                        )
        );
	}

}
