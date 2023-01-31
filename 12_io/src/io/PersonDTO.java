package io;

import java.io.Serializable;

public class PersonDTO implements Serializable {
	/*추상메소드 존재x. 그냥 implement하면 알아서 직렬화 진행함.*/
	
	//필드
	private String name;
	private int age;
	private double height;
	
	//생성자
	public PersonDTO(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	

}
