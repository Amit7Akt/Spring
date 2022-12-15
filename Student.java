package com.loadingLiterals;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	private String Student_name;
	private String Course;
	private String hobby;
	public String getStudent_name() {
		return Student_name;
	}
	
	@Value("Amit")
	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}
	public String getCourse() {
		return Course;
	}
	
	@Value("java")
	public void setCourse(String course) {
		Course = course;
	}
	public String getHobby() {
		return hobby;
	}
	
	@Value("Reading Books")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void display() {
		System.out.println("name of the student is :" + getStudent_name());
		System.out.println("Course selected : "+ getCourse());
		System.out.println("Hobby is :" + getHobby());
	}
}
