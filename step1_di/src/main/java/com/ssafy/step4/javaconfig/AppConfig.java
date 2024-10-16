package com.ssafy.step4.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	
	@Bean
	public GreetingService greeting() {
		return new GreetingServiceImpl(outputter());
	}
	
	@Bean
	public OutputService outputter() {
		return new OutputServiceConsole();
	}
}
