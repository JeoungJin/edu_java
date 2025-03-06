package com.shinhan.day12;

import lombok.Setter;

@Setter
public class User2Thread extends Thread{

	Calculator calculator;
	
	User2Thread(){
		setName("User2Thread"); //Thread이름
	}
	
	@Override
	public void run() {
		calculator.setMemory(50);
	}
}
