package com.ssafy.step1.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GreetingTest {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");
		AnnotationConfigApplicationContext context = 
                new AnnotationConfigApplicationContext(AppConfig.class);
		
		GreetingService greeting = context.getBean("greeting",GreetingService.class);
		System.out.println(greeting.getClass().getSimpleName());
		greeting.sayHello("농담곰");
		greeting.sayGoodbye("농담곰");
		
//		System.out.println(greeting.getClass().getDeclaredMethod("sayHello", String.class));
	}

	
}
