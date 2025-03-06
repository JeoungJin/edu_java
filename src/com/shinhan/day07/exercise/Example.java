package com.shinhan.day07.exercise;

public class Example {
	public static void action(Parent3 a) {
		//타입이 부모, 부모가 가진 field로 method로 자식것을 볼수있다. 
		//메서드는 Override된것이 수행된다. 
		//
		a.method1();
	 
		if (a instanceof Child4 c ) {
			//Child4 c = (Child4)a;
			c.method2();
		}
	}

	public static void main(String[] args) {
		action(new Parent3());
		action(new Child3());
		action(new Child4());
	}
}
