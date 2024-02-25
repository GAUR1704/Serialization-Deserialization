package com.prowings.SerializationComposition;

import java.io.Serializable;

public class Head implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7743321393280288283L;

	private String vandorName;
	
	private int headnumber;

	public Head() {
		super();
	}

	public Head(String vandorName, int headnumber) {
		super();
		this.vandorName = vandorName;
		this.headnumber = headnumber;
	}

	public String getVandorName() {
		return vandorName;
	}

	public void setVandorName(String vandorName) {
		this.vandorName = vandorName;
	}

	public int getHeadnumber() {
		return headnumber;
	}

	public void setHeadnumber(int headnumber) {
		this.headnumber = headnumber;
	}

	@Override
	public String toString() {
		return "Head [vandorName=" + vandorName + ", headnumber=" + headnumber + "]";
	}
	
	
	
	

}
