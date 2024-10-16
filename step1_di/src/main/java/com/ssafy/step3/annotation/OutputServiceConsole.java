package com.ssafy.step3.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service("outputter")
public class OutputServiceConsole implements OutputService {
	
	public OutputServiceConsole() {
		System.out.println("OutputServiceConsole");
	}

	@Override
	public void println(String msg) {
		System.out.println(msg);
	}

}
