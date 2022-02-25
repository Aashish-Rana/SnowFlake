package com.snowflake.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.snowflake.modal.Student;

@Repository
public interface SnowRepo{

	/*
	 * @Query(value="select * from STUDENT where STUDENT_NAME= ?1", nativeQuery =
	 * true) Student findByStudentName(String studentName);
	 */
    
public List<Student> findByAll();

}
