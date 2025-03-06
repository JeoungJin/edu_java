package com.shinhan.day12;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Calculator {

	private int memory;
	
	//공유자원을 사용시 다른thread가 접근하는 것을 막기(Lock)
	synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(1000); //1초간 일시정지, 2초후 실행대기상태로 갔다가 차례가되면 실행한다.  
		} catch (InterruptedException e) { //Interrupt함수를 수행하면 시간이 지나지않아도 실행대기상태로 갔다가 차례가되면 실행한다.  
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+":" + this.memory);
	}
	
}
