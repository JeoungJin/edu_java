package com.shinhan.day12;

//2)이미 다른class를 상속받고있다면 Runnable Interface를 구현한다. 쓰레드로 만들기가능 
public class AlphabetLowerCaseImpl extends Object implements Runnable{

	@Override
	public void run() {
		for(char ch='a'; ch<='z'; ch++) {
			System.out.println(Thread.currentThread().getName() +"--"+ch);
		}
		
	}

}
