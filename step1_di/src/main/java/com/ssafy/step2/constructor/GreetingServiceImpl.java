package com.ssafy.step2.constructor;

public class GreetingServiceImpl implements GreetingService{

	private OutputService outputter;  // 짝궁 : 의존객체
	
	public GreetingServiceImpl(OutputService outputter) {  // 짝궁 받기 : SetterDI
		super();
		this.outputter = outputter;
	} 


	@Override
	public void sayHello(String name) {
		outputter.println("Hello " + name);
	}

}
