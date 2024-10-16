package com.ssafy.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("reader")
public class Reader {
	// 코드작성
	
	private Book book;
	
	@Autowired
	public void setBook(Book book) {
		this.book = book;
	}
	
	public void read() {
		System.out.println(this.book.getInfo() + "을(를) 열심히 읽습니다.");
	}
}
