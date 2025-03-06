package com.shinhan.day06;

public class PrinterTest {

	
	public static void main(String[] args) {
		Account account = new Account();
	 
		
		account.setBalance(10000);
		System.out.println("현재 잔고: " + account.getBalance()); //현재 잔고: 10000
		account.setBalance(-100);
		System.out.println("현재 잔고: " + account.getBalance()); //현재 잔고: 10000
		account.setBalance(2000000);
		System.out.println("현재 잔고: " + account.getBalance()); //현재 잔고: 10000
		account.setBalance(300000);
		System.out.println("현재 잔고: " + account.getBalance()); //현재 잔고: 300000
	}
	
	
	
	public static void f2(String[] args) {
		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		if(obj1 == obj2) {
		System.out.println("같은 ShopService 객체입니다."+obj1);
		} else {
		System.out.println("다른 ShopService 객체입니다.");
		}
	}
	
	
	public static void f(String[] args) {
		Printer.println2(false);
		Printer.println2(100);
		Printer.println2("static메서드이용");

		Printer p = new Printer();
		p.println(false);
		p.println(100);
		p.println("instance 메서드이용");
		
	}

}
