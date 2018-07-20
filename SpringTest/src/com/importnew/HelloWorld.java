package com.importnew;

public class HelloWorld {
	
	private String message;
	private int age;
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setage(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void printMessage() {
		System.out.println("Your Message :" + message);
		System.out.println("age :" + age);
	}

}
