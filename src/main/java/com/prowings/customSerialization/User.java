package com.prowings.customSerialization;

import java.io.Serializable;

public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6524732665546139527L;
	
	private int uId;
	private String name;
	private String Password;
	
	public User() {
		super();
	}
	
	public User(int uId, String name, String password) {
		super();
		this.uId = uId;
		this.name = name;
		Password = password;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return Password;
	}

	public void SetPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "User [uId=" + uId + ", name=" + name + ", Password=" + Password + "]";
	}
	
	

}
