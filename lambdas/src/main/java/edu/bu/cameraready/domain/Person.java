package edu.bu.cameraready.domain;

public class Person {
	private int age;
	private String name;

	/**
	 * @param age
	 * @param name
	 */
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name + " , " + age;
	}
}