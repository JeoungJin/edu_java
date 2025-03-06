package com.shinhan.day12;

import lombok.Setter;

@Setter
public class PrintThread2 extends Thread{

	boolean stop;
	
	@Override
	public void run() {
		
		//1)방법1
		/*
		while(!stop) {
			System.out.println("실행중이다." + stop);
		}*/
		//1)방법2
		try {
			while(true) {
				System.out.println("실행중이다.");
				sleep(1);	 
			}
		}catch(InterruptedException ex) {
			
		}
		
		System.out.println("자원정리~" +stop);
		System.out.println("안전하게 Thread종료");
	}
	
}
