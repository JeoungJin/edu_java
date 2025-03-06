package com.shinhan.day08.lab;

interface Machine{
	 //1.상수
	//2.추상메서드
	//3.default메서드
	default void f1() {
		
	}
	//4.static메서드
	String COMPANY="신한";
	//5.private메서드
	//6.private static메서드
}
class MachineA implements Machine{
	public void f1() {
		
	}
}
class MachineB implements Machine{}

public class 확인문제 {
	Machine machine = new MachineB();
	
	public static void main(String[] args) {
		q3(new MachineB());

	}
	private static void q3(Machine machine) {
		Machine[] arr = new Machine[3];
		arr[0] = new MachineB();
	}
	private static void q1() {
		//불가 Machine a = new Machine();
		//1.자동형변환
		//interface = 구현class
		//2.강제
		//구현class aa = (구현class)interface
		Machine a = new MachineA();
		MachineA b = (MachineA)a;
		
		System.out.println(Machine.COMPANY);
	}

}
/*
1. 인터페이스에 대한 설명으로 틀린 것은 무엇입니까?
➊ 인터페이스로 객체(인스턴스)를 생성할 수 있다.- (X)
➋ 인터페이스는 다형성의 주된 기술로 사용된다. = 자동형변환 + overide
➌ 인터페이스를 구현한 객체는 인터페이스로 동일하게 사용할 수 있다.
➍ 인터페이스를 사용함으로써 객체 교체가 쉬워진다.


2. 인터페이스의 구성 멤버에 대한 설명으로 틀린 것은 무엇입니까?
➊ 인터페이스는 인스턴스 필드가 없고 상수를 멤버로 가진다.
➋ 추상 메소드는 구현 클래스가 재정의해야 하는 멤버이다.
➌ 디폴트 메소드는 구현 클래스에서 재정의할 수 없다. (X)
➍ 정적 멤버는 구현 객체가 없어도 사용할 수 있는 멤버이다.


3. 인터페이스 다형성에 대한 설명으로 틀린 것은 무엇입니까?
➊ 필드가 인터페이스 타입일 경우 다양한 구현 객체를 대입할 수 있다.
➋ 매개변수가 인터페이스 타입일 경우 다양한 구현 객체를 대입할 수 있다.
➌ 배열이 인터페이스 타입일 경우 다양한 구현 객체를 저장할 수 있다.
➍ 구현 객체를 인터페이스 타입으로 변환하려면 강제 타입 변환을 해야 한다.(X)자동 
*/
