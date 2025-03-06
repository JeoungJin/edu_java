package com.shinhan.day13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.shinhan.day12.Account;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

//Thread : 하나의 Process내의 프로그램의 흐름 , run()구현
//1)java.lang.Thread상속 ...new MyThread1()
class MyThread1 extends Thread {
	
	MyThread1(){
		super("AA");
	}
	
	@Override
	public void run() {
		System.out.println(currentThread().getName() +"---MyThread1 구현한다.");
	}
}

//2)Runnable interface구현 ....Thread만든다. ....new Thread(new MyRunnable())
class MyRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"---MyRunnable 구현한다.");

	}
}

//Generic : 사용시 타입을 결정한다. 
@ToString
@AllArgsConstructor
@NoArgsConstructor
class Product<T,A>{
	T model;
	A size;
}
class ChildProduct<T,A,B> extends Product<T,A>{
	B color;
	ChildProduct(T model, A size, B color){
		super(model,size);
		this.color = color;
	}
}

@ToString
@AllArgsConstructor
class Goods<T>{
	T aa;
}

class Shopping {
	
	static void f1(Goods<?> g) {
		System.out.println("f1");
		System.out.println(g);
	}
	static <T,A> void f2(Goods<? extends Product<T,A>> g) {
		System.out.println("f2");
		System.out.println(g);
	}
	static <T,A,B> void f3(Goods<? super ChildProduct<T,A,B>> g) {
		System.out.println("f3");
		System.out.println(g);
	}
	
	
	static <T,A>  Product<T,A> makeProduct(T model, A size) {
		return new Product<>(model, size);
	}
	
	static <T,A,B> ChildProduct<T,A,B> makeChildProduct(T model, A size, B color) {
		return new ChildProduct<T,A,B>(model,size,color );
	}
	
	
}



public class Review {
	public static void main(String[] args) {
			f5();
			System.out.println(Thread.currentThread().getName() + "End~~");
	}
	private static void f5() {
		Goods<String> g1 = new Goods<>("@@@@");
		Shopping.f1(g1);
		
		Product<String,Integer> p1 = Shopping.makeProduct("ABC모델", 1000);
		Product<Integer,Account> p2 = Shopping.makeProduct(1000, new Account("A", "B", 100));		
		ChildProduct<String,String,String> p3 = Shopping.makeChildProduct("AA", "big", "red");
		
		Goods<Product<String,Integer>> g2 = new Goods<>(p1);
		Goods<ChildProduct<String,String,String>> g3 = new Goods<>(p3);
		Shopping.f2(g2);
		Shopping.f2(g3);
		
		Shopping.f3(g2);
		Shopping.f3(g3);		
	}
	private static void f4() {
		Product<String,Integer> p1 = Shopping.makeProduct("ABC모델", 1000);
		Product<Integer,Account> p2 = Shopping.makeProduct(1000, new Account("A", "B", 100));		
		ChildProduct<String,String,String> p3 = Shopping.makeChildProduct("AA", "big", "red");
	}
	private static void f3() {
		Product<String,Integer> p = new Product<>("TV", 1000);
		Product<Integer,Account> p2 = new Product<>(2000, new Account("A", "B", 100));
		System.out.println(p);
		System.out.println(p2);
		
	}

	private static void f2() {
		ExecutorService service = Executors.newFixedThreadPool(5);
		
	}

	private static void f1() {
		int a=10; a++;
		final int score = a;
		Thread t1 = new MyThread1();
		Thread t2 = new Thread(new MyRunnable());
		Thread t3 = new Thread(new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName() + ":"+ score+"익명구현class");
			};
		} );
		Thread t4 =  new Thread(()->{
			System.out.println(Thread.currentThread().getName() +"람다표현식");
		});
		t1.start();t2.start();t3.start();t4.start();
		 
	}
}

















