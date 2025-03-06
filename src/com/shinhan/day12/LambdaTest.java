package com.shinhan.day12;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//규격서 : 상수+추상메서드 +...... 
interface MyInterface1 {
	public abstract void print();
}
//구현class
class MyClassImpl1 implements MyInterface1{
	public void print() {
		System.out.println("구현class");
	}
}

public class LambdaTest {

	public static void main(String[] args) {
		
		//1.구현class
		//MyInterface1 a = new MyClassImpl1();
		//2.익명구현class
		MyInterface1 a = new MyInterface1() {
			public void print() {
				System.out.println("익명구현class");
			}
		};
		//3.람다표현식 
		MyInterface1 a2 = ()->{
			System.out.println("람다표현식 ");
		};
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("익명구현class1");
			}
		};
		Runnable r2 = ()-> {
				System.out.println("람다~~~");
		 };
		 
		 
		 
		//Thread t1 = new Thread(r2);
		//t1.start();
		
		ExecutorService service = Executors.newFixedThreadPool(5);
		//service.execute(r2);
		service.execute(()->{
			System.out.println("----------------");
		});
		
		service.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				return "***";
			}
		});
		Future<String> result = service.submit( ()->"****");
		try {
			String s = result.get();
			System.out.println(s);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		service.shutdown();
		
		System.out.println("main끝");
		//a2.print();
		
	}

}






