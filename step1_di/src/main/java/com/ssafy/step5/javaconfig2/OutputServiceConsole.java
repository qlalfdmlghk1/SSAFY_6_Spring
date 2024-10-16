package com.ssafy.step5.javaconfig2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class OutputServiceConsole implements OutputService {
	
	public OutputServiceConsole() {
		System.out.println("OutputServiceConsole");
	}

	@Override
	public void println(String msg) {
		System.out.println(msg);
	}

}
