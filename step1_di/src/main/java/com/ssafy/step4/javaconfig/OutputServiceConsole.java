package com.ssafy.step4.javaconfig;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
public class OutputServiceConsole implements OutputService {
	
	public OutputServiceConsole() {
		System.out.println("OutputServiceConsole");
	}

	@Override
	public void println(String msg) {
		System.out.println(msg);
	}

}
