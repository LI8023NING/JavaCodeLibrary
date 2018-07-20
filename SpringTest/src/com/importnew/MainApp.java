package com.importnew;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//set×¢Èë
public class MainApp {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("lining.xml");
		
		HelloWorld obj = (HelloWorld)context.getBean("HelloWorld");
		
		obj.printMessage();
	}
}
