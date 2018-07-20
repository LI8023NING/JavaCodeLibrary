package com.yibai.code;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yibai.config.AppConfig;
import com.yibai.hello.HelloWorld;

public class App {
	
    public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		
		obj.printHelloWorld("Spring JavaConfig");
    }

}
