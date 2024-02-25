package com.prowings.SerializationComposition;

import java.io.Serializable;

public class College implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7089885186060008051L;
	
	private int makeYear;
	private String name;
	private Department department;
	
	public College() {
		super();
	}

	public College(int makeYear, String name, Department department) {
		super();
		this.makeYear = makeYear;
		this.name = name;
		this.department = department;
	}

	public int getMakeYear() {
		return makeYear;
	}

	public void setMakeYear(int makeYear) {
		this.makeYear = makeYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "College [makeYear=" + makeYear + ", name=" + name + ", department=" + department + "]";
	}
	
	

}
