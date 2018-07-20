package com.yibai.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.yibai.hello.HelloWorld;
import com.yibai.hello.impl.HelloWorldImpl;

@Configuration
public class AppConfig {
	
	@Bean(name="helloBean")
	public HelloWorld helloWorld() {
		
		return new HelloWorldImpl();
	}
}
