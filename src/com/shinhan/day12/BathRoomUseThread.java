package com.shinhan.day12;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BathRoomUseThread extends Thread{

	BathRoom room;
	String name;
	
	
	@Override
	public void run() {
		System.out.println(currentThread().getName());
		for(int i=1;i<=3;i++) {
			 
			room.use(name);
		}
	}
	
	
}
