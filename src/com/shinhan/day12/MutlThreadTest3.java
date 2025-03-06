package com.shinhan.day12;

public class MutlThreadTest3 {

	public static void main(String[] args) {
		f6();
		System.out.println("========main End=====");

	}
	private static void f6() {
		//데몬
		AutoSaveThread t1 = new AutoSaveThread();
		t1.setDaemon(true); //주thread가 끝나면 같이종료 
		t1.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//2.안전하게 Thread종료....InterruptedException발생 
	private static void f5() {
		PrintThread2 t1 = new PrintThread2();
		t1.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.interrupt(); //InterruptedException발생 
	}
    //1.안전하게 Thread종료....변수이용
	private static void f4() {
		PrintThread2 t1 = new PrintThread2();
		t1.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.setStop(true);
		//권장안함 t1.stop();
		
		
	}

	private static void f3() {
		WorkObject workObject = new WorkObject();
		
		ThreadA t1 = new ThreadA(workObject);
		ThreadB t2 = new ThreadB(workObject);
		t1.start();
		t2.start();
		
	}

	private static void f2() {
		Calculator cal = new Calculator();
		User1Thread t1 = new User1Thread();
		User2Thread t2 = new User2Thread();
		t1.setCalculator(cal);
		t2.setCalculator(cal);
		t1.start();
		t2.start();
		
	}

	private static void f1() {
		SumThread t1 = new SumThread(100);
		SumThread t2 = new SumThread(100000);
		t1.start();
		t2.start();
		 
		    try {
		    	//Thread가 끝나길 기다림 
				t1.join();t2.join();
				System.out.println(t1.getSum());
				System.out.println(t2.getSum());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
		 
		
	}

}
