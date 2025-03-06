package com.shinhan.day12;

//공유data
public class WorkObject {

	//synchronized일때만 wait(), notify()가 가능 
	public synchronized void methodA() {
		System.out.println(Thread.currentThread().getName() + " methodA실행 ");
		notify(); //일시정지상태에 있는 다른thread가 실행대기 상태로간다. 
		try {
			wait(); //나의 thread가 일시정지상태로 간다.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public synchronized void methodB() {
		System.out.println(Thread.currentThread().getName() + " methodB실행 ");
		notify(); //일시정지상태에 있는 다른thread가 실행대기 상태로간다. 
		try {
			wait(); //나의 thread가 일시정지상태로 간다.
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
