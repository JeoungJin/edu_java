package com.shinhan.day07;

public class Computer extends Machine{
	public void work() {
		System.out.println("Computer class가 구현함 ");
	}
	
	
	public static void main(String[] args) {
		Computer aa = new Computer();
		aa.powerOn();
		aa.powerOff();
		aa.work();
	}
}
