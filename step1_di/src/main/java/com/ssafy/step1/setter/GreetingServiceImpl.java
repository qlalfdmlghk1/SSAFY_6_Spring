package com.ssafy.step1.setter;

public class GreetingServiceImpl implements GreetingService{

	private OutputService outputter;  // 짝궁 : 의존객체
	
	public void setOutputter(OutputService outputter) {  // 짝궁 받기 : SetterDI
		this.outputter = outputter;
	} 


	@Override
	public void sayHello(String name) {
		outputter.println("Hello " + name);
	}

}
