package com.shinhan.day12;

//1)thread만들기 ---- Thread상속받기 
public class AlphabetUpperCaseThread extends Thread{

	@Override
	public void run() {
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.println(currentThread().getName() +"--"+ch);
		}
	}

	
	
}
