package com.ssafy.step3.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		GreetingService greeting = context.getBean("greeting",GreetingService.class);
		greeting.sayHello("김태희");
	}

	
}
