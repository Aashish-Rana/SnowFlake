package com.snowflake.modal;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7600272067356247671L;

	@Id
    private int studentId;
    private String studentName;
    private String studentColor;
    
    

	public Student(int studentId, String studentName, String classId) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentColor = classId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getClassId() {
		return studentColor;
	}

	public void setClassId(String classId) {
		this.studentColor = classId;
	}
	
    
    
}
