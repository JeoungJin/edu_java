package com.shinhan.day12;

import lombok.Setter;

@Setter
public class User1Thread extends Thread{

	Calculator calculator;
	
	User1Thread(){
		setName("User1Thread"); //Thread이름
	}
	
	@Override
	public void run() {
		calculator.setMemory(100);
	}
}
