package com.prowings.SerializationComposition;

import java.io.Serializable;

public class Car implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5673035414068588048L;
	
	private String companyName;
	private int makeYear;
	private Engine engine;

	public Car() {
		super();
	}

	public Car(String companyName, int makeYear, Engine engine) {
		super();
		this.companyName = companyName;
		this.makeYear = makeYear;
		this.engine = engine;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getMakeYear() {
		return makeYear;
	}

	public void setMakeYear(int makeYear) {
		this.makeYear = makeYear;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [companyName=" + companyName + ", makeYear=" + makeYear + ", engine=" + engine + "]";
	}

}
