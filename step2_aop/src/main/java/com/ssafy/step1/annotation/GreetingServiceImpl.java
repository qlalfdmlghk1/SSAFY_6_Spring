package com.ssafy.step1.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// @Component("greeting")
@Service("greeting")
public class GreetingServiceImpl implements GreetingService{
	
	@Override
	public void sayHello(String name) {
		System.out.println("Hello " + name);
	}
	
	@Override
	public void sayGoodbye(String name) {
		System.out.println("Goodbye " + name);
	}
	
}
