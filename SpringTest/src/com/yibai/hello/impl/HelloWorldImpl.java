package com.yibai.hello.impl;

import com.yibai.hello.HelloWorld;

public class HelloWorldImpl implements HelloWorld{

	@Override
	public void printHelloWorld(String msg) {
		
		System.out.println("Hellp:" + msg);
	}
}
