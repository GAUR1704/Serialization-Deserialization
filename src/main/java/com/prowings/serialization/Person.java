package com.prowings.serialization;

public class Person {

	private float height;
	private String gender;
	private int age;

	public Person() {
		super();
	}

	public Person(float height, String gender, int age) {
		super();
		this.height = height;
		this.gender = gender;
		this.age = age;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "person [height=" + height + ", gender=" + gender + ", age=" + age + "]";
	}

}
