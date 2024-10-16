package com.ssafy.step3.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// @Component("greeting")
@Service("greeting")
public class GreetingServiceImpl implements GreetingService{

	private OutputService outputter;  // 짝궁 : 의존객체
	
	@Autowired 
	public GreetingServiceImpl(OutputService outputter) {  // 짝궁 받기 : SetterDI
		super();
		this.outputter = outputter;
	} 


	@Override
	public void sayHello(String name) {
		outputter.println("Hello " + name);
	}

}
