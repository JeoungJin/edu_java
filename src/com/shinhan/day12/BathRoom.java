package com.shinhan.day12;

public class BathRoom {

	boolean isFirst = true;
	
	public synchronized void use(String name) {
		if(isFirst && name.equals("김")) {
			try {
				wait(); //깨워줄때까지 기다린다. 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(name + "님이 입장");
		System.out.println(name + "님이 사용");
		System.out.println(name + "님이 퇴장");
		System.out.println( "-------------");
		isFirst = false;
		notifyAll();//wait()상태를 깨우기 
	}
	
}
