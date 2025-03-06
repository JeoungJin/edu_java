package com.shinhan.day07;

public class App {

	public static void main(String[] args) {
		//Animal aa = new Animal("",1);
		Cat ani1 = new Cat("야옹이", 10);
		Dog ani2 = new Dog();
		work(ani1) ;
		work(ani2) ;
		
	}
	public static void work(Animal aa) {
		aa.sound();
	}

}
