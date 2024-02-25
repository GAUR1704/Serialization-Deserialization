package com.prowings.SerializationComposition;

import java.io.Serializable;

public class Department implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 590053642185964229L;
	
	private String name;
	private int studentCapacity;
	private Student student;
	
	public Department() {
		super();
	}

	public Department(String name, int studentCapacity, Student student) {
		super();
		this.name = name;
		this.studentCapacity = studentCapacity;
		this.student = student;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentCapacity() {
		return studentCapacity;
	}

	public void setStudentCapacity(int studentCapacity) {
		this.studentCapacity = studentCapacity;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", studentCapacity=" + studentCapacity + ", student=" + student + "]";
	}
	
	
	

}
