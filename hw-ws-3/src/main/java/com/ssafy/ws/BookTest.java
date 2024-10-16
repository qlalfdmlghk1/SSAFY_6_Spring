package com.ssafy.ws;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest {
	public static void main(String[] args) {
		//코드작성
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/ssafy/ws/applicationContext.xml");
		
		Reader reader = context.getBean("reader",Reader.class);
		
		reader.read();
	}
}
