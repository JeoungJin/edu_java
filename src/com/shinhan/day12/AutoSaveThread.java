package com.shinhan.day12;

public class AutoSaveThread extends Thread{

	public void save() {
		System.out.println("작업내용을 저장한다. ");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				break;
			}
			save();
		}
		
	}
	
}
