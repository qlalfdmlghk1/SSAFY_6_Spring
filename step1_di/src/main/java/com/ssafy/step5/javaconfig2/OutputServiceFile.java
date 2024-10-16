package com.ssafy.step5.javaconfig2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.stereotype.Component;

public class OutputServiceFile implements OutputService {

	@Override
	public void println(String msg) {
		try(PrintWriter out = new PrintWriter(new FileWriter("msg.txt",true))) {
			out.println(msg);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
