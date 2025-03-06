package com.shinhan.day09;

abstract class Tire{
	public abstract void roll() ;
}
class 금호타이어 extends Tire{
	public void roll() {
		System.out.println("금호타이어가 굴러갑니다.(재정의)");
	}
}
class Car{
	//추상class는 인스턴스 생성불가 Tire tire1 = new Tire();
	Tire tire2 = new 금호타이어();
	Tire tire3 = new Tire() {
		public void roll() {
			System.out.println("AA타이어가 굴러갑니다.");
		}
	};
	
	void method() {
		Tire tire4 = new 금호타이어();
		Tire tire5 = new Tire() {
			public void roll() {
				System.out.println("BB타이어가 굴러갑니다.");
			}
		};
		call(tire2);
		call(tire3);
		call(tire4);
		call(tire5);
	}

	private void call(Tire t) {
		t.roll();
		
	}
	
}



public class 익명구현class연습 {

	public static void main(String[] args) {
		Car car = new Car();
		car.method();

	}

}
