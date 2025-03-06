package com.shinhan.day12;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//람다표현식 불가능 
interface MyInterface {
	void methodA();

	void methodB();
}

//람다표현식 가능 
interface MyInterface2 {
	void methodA();

}

//람다표현식 가능 
class MyCallable implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}

//람다표현식 가능 
class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}

public class ThreadPoolExample {

	public static void main(String[] args) {
		Runnable a = new Runnable() {
			@Override
			public void run() {

			}
		};
		Runnable a2 = () -> {
		};
		
		Callable<String> a3 = new Callable<String>() {
			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				return null;
			}
		};
		Callable<String> a4 = ()->"자바";
		
		
		try {
			System.out.println(a4.call());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void f2() {
		// 작업이 많은 경우....무한정의 Thread를 사용하면 성능저하될수 있다.
		ExecutorService service = Executors.newFixedThreadPool(5);

		// 1->1, 2->3 ..... 10->55....100->5050
		for (int i = 1; i <= 100; i++) {
			int end = i;
			Future<Integer> result = service.submit(() -> {
				System.out.println(Thread.currentThread().getName() + "쓰레드가 처리함");
				int total = 0;
				// Local class는 지역변수를 접근할수 있다. 접근하면 무조건 final이다.
				for (int j = 1; j <= end; j++) {
					total += j;
				}
				return total;
			});
			try {
				System.out.println("받은값 sum=" + result.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	// execute : return없는 경우 사용
	public static void f() {
		String[][] mails = new String[1000][3];

		for (int i = 0; i < mails.length; i++) {
			mails[i][0] = "admin@my.com";
			mails[i][1] = "member" + i + "@my.com";
			mails[i][2] = "신상입고";
		}
		ExecutorService service = Executors.newFixedThreadPool(10);
		for (int i = 0; i < mails.length; i++) {
			int cnt = i;
			service.execute(() -> {
				String s = Thread.currentThread().getName() + "보낸사람:" + mails[cnt][0] + "받는사람:" + mails[cnt][1] + "내용:"
						+ mails[cnt][2];
				System.out.println(s);
			});
		}
		service.shutdown();
	}

}
