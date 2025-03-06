package com.shinhan.day12;

public class MultiThreadTest {

	public static void main(String[] args) {
	
		
		//A~Z출력하기
		//a-z출력하기
		Thread thread1 = new AlphabetUpperCaseThread();
		Thread thread2 = new Thread(new AlphabetLowerCaseImpl());
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() +
						             "-Runnable인터페이스구현(익명)");
			}
		});
		Thread thread4 = new Thread(()-> {		
			    try {
					Thread.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() +
						             "-Runnable인터페이스구현(람다표현식)");
				});
		
		
		//쓰레드구현(run)
		//쓰레드시작(start)
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
	 
		
		//0~26까지 출력하기
		for(int ch=1; ch<=26; ch++) {
			System.out.println(Thread.currentThread().getName() +"--"+ch);
		}
		


		System.out.println("----------Main END----------");

	}

}
