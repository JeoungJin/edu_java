package com.shinhan.day07;

//abstract class: class내의 abstract메서드가 1개이상있다. 
public abstract class Machine extends Object{
	public void powerOn() {
		System.out.println(this.getClass().getSimpleName()+"전원켠다");
	}

	public void powerOff() {
		System.out.println(this.getClass().getSimpleName()+"전원끈다");
	}
    //정의있고 구현은 없다. 구현은 자식이한다. 
	public abstract void work();
}