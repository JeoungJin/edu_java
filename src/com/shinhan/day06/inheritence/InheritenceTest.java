package com.shinhan.day06.inheritence;
public class InheritenceTest {
	public static void main(String[] args) {
		call();
	}
	private static void call() {
		Tire[] arr = new Tire[2];
		//자동형변환 
		arr[0] = new 금호타이어();
		arr[1] = new 한국타이어();
		call2(arr);
	}
	private static void call2(Tire[] arr ) {
	
		for(Tire t:arr) {
			//다형성 : 사용법은 같지만 결과가 다르다. 
			t.roll();
			//12버젼부터 가능: t instanceof 한국타이어 변수!!!
			if(t instanceof 한국타이어 aa) {
				//강제형변환 
				//한국타이어 aa = (한국타이어)t;
				aa.display();
			}
		}
		
	}
	
	private static void f8() {
		String s1 = "이것이 자바다";
		Integer i = 100;
		f9(s1);
		f9(i);
	}
	
	private static void f9(Object aa) {
		System.out.println("----------------");
		System.out.println(aa.toString());
		if(aa instanceof String s) {
			//String s = (String)aa;
			int len = s.length();
			System.out.println("길이:" + len);
		}
		
	}
	
	private static void f7() {
		//형변환(자동, 강제)
		int a;
		char ch = 'A';
		//1.기본형 자동 형변환 : 큰방 = 작은값 
		a = ch;
		System.out.println(a);
		//2.기본형 강제형변환 : 작은방 = (작은방타입)큰값;
		ch = (char)a;
		System.out.println(ch);
		
		//객체의 형변환
		//1.자동 형변환 : 부모 = 자식		
		//2.강제 형변환 : 자식 = (자식)부모 
		
		Dog animal1 = new Dog();
		Cat animal2 = new Cat();		
		
		useAnimal(animal2);
		
		useAnimal(animal1);
	}
	private static void useAnimal(Animal aa) {
		System.out.println("---------------------");
		//사용법은 같지만 결과가 다르다.(다형성)
		aa.sing();
		aa.fly();
		//컴파일시 오류없음, 실행시 aa가 Cat이 아니면 오류 
		System.out.println(aa instanceof Cat);
		if(aa instanceof Cat) {
			Cat cat = (Cat)aa;
			cat.play();
		}
		
		
	}
	private static void f6() {
		Account acc1 = new Account();
		BonusPointAccount acc2 = new BonusPointAccount(null, null, 1000, 0);
		CheckingAccount acc3 = new CheckingAccount(null, null, 2000, null);
		CreditLineAccount acc4 = new CreditLineAccount(null, null, 3000, 0);
		acc1.deposit(100);
		acc2.deposit(100);
		acc3.deposit(100);
		acc4.deposit(100);
		acc1.print();
		acc2.print();
		acc3.print();
		acc4.print();
		System.out.println(acc1.balance);
		System.out.println(acc2.balance);
		System.out.println(acc3.balance);
		System.out.println(acc4.balance);
		
	}
	private static void f5() {
		BonusPointAccount acc1 = new BonusPointAccount("123", "홍", 1000, 1);
		acc1.deposit(5000);
		System.out.println(acc1.balance);
		System.out.println(acc1.bonusPoint);
	}
	private static void f4() {
		CreditLineAccount acc1 = new CreditLineAccount("123", "aa", 1000, 500);
		acc1.deposit(2000);
		System.out.println(acc1.balance);
		int amount = acc1.withdraw(3600);
		System.out.println("출금:" + amount);
		System.out.println("잔고:"+ acc1.balance);
		
	}

	private static void f3() {
		Child ch = new Child();
		//ch.f2();
		ch.f1();
		System.out.println(ch.a);
		
	}

	private static void f2() {
		CheckingAccount acc1 = 	new CheckingAccount();
		acc1.accountNo = "999-99";
		acc1.ownerName = "aa";
		acc1.balance = 500;
		acc1.cardNo = "7777";
		acc1.deposit(2000);
		System.out.println("잔고:"+acc1.balance);
		int amount = acc1.withdraw(500);
		System.out.println("출금:" + amount);
		System.out.println("잔고:"+acc1.balance);
		amount = acc1.pay("7777", 300);
		System.out.println("카드출금:" + amount);
		System.out.println("출금후잔고:"+acc1.balance);
	}
	
	private static void f1() {
		CheckingAccount acc1 = 
			new CheckingAccount("123","홍",1000,"777");
		acc1.deposit(2000);
		System.out.println("잔고:"+acc1.balance);
		int amount = acc1.withdraw(500);
		System.out.println("출금:" + amount);
		System.out.println("잔고:"+acc1.balance);
	}

}
