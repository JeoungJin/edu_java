package com.shinhan.day10;

//extends Object생략되어있음
class Parent {

}

//규격서
interface MyInterface {
	// 상수+추상메서드+default메서드+static메서드+private메서드
}

//구현class
class MyInterfaceImpl1 implements MyInterface {
}

class MyInterfaceImpl2 implements MyInterface {
}

class Child extends Parent implements MyInterface, Comparable<Child> {
	// 1.field
	int a = 1;
	static int b = 2;

	// 2.constructor
	// 3.method
	void method1() {
	}

	static void method2() {
	}

	// 4.block {} static{}
	// 5.inner class
	// 1)instance inner class
	class InnerClass {
		void func() {
			System.out.println(a + b);
			method1();
			method2();
		}
	}

	// 2)static inner class
	static class StaticInnerClass {
		String name = "자바";
		static int price = 20000;

		void func() {
			// 불가 System.out.println(a);
			System.out.println(b);
			// 불가 method1();
			method2();
		}
	}

	// 3)Local inner class
	void call(int param) {
		// 지역변수
		int score = 100;
		// score = 200;
		class LocalInnerClass {
			void method1() {
				// 외부의 지역변수가 LocalInnerClass에서 사용되면 Modifier가 final이된다.
				int score2 = score;
				score2++;
				System.out.println(score);
				System.out.println(score2);
				System.out.println(param);
			}
		}

		class LocalInnerClass2 {
			void method1() {
				// 지역변수가 LocalInnerClass에서 사용되면 Modifier가 final이된다.
				System.out.println(score);
				System.out.println(param);
			}
		}
	}

	@Override
	public int compareTo(Child o) {
		// TODO Auto-generated method stub
		return 0;
	}
	// 부모의 field, method를 상속받아서 private제외하고 모두 사용가능
	// 수정가능(final제외하고 Override가능)
	// 추가가능(만약, 이름같고 매개변수다름 return같음...Overloading)
}

class Car {
	// instance inner class
	class Tire {
	}

	// static inner class
	static class Engine {
	}
}

//interface는 instance를 만들수없다 new Action();
//interface는 구현class정의하거나 익명구현객체생성이 가능 new Action(){}
interface Action {
	public void work();
}

interface Vehicle {
	public void run();
}

public class Review {
	
	public static void main(String[] args) {
		lab6();
	}
	//1.속성(field)
	Vehicle field = new Vehicle() {
		public void run() {};
	};
	private static void lab6() {
		Review aa = new Review();
		aa.method1();
		//3.매개변수, param, argument
		aa.method2(new Vehicle() {
				public void run() {};
			});
		
	}
	void method1() {
		//2.local변수
		 Vehicle localVar = new Vehicle() {
				public void run() {};
			};
		 localVar.run();
	}
	void method2(Vehicle v) {
		 v.run();
	}
		
	private static void lab5() {
		Action action = new Action() {
			public void work() {
				System.out.println("------");
			}
		};
		action.work();

		// 즉시실행
		(new Action() {
			public void work() {
				System.out.println("------");
			}
		}).work();

	}

	private static void lab4() {
		Car myCar = new Car();
		Car.Tire tire = myCar.new Tire();
		Car.Engine engine = new Car.Engine();

	}

	// field
	MyInterface inter = new MyInterface() {
	};

	private static void f2() {
		f3(new MyInterface() {
		});
		MyInterface inter2 = new MyInterface() {
			// MyInterface(){}
		};
		// ➋ 익명 객체는 클래스를 상속하거나 인터페이스를 구현해야만 생성될 수 있다(O)
		// ➋ 익명 객체는 필드, 매개변수, 로컬 변수의 초기값으로 주로 사용된다.(O)
		// ➌ 익명 객체에는 생성자를 선언할 수 있다.(X)
		// ➍ 익명 객체는 주로 재정의된 메소드를 멤버로 가진다. (O)

	}

	private static void f3(MyInterface my) {
		// TODO Auto-generated method stub

	}

	private static void f1() {
		// ➊ 인스턴스 멤버 클래스는 바깥 클래스의 객체가 있어야 사용될 수 있다.
		Child.InnerClass a = new Child().new InnerClass();
		// ➋ 정적 멤버 클래스는 바깥 클래스의 객체가 없어도 사용될 수 있다.
		System.out.println(Child.StaticInnerClass.price);
		Child.StaticInnerClass b = new Child.StaticInnerClass();
		System.out.println(b.name);
		// ➌ 인스턴스 멤버 클래스 내부에는 바깥 클래스의 모든 필드와 메소드를 사용할 수 있다.

		// ➍ 정적 멤버 클래스 내부에는 바깥 클래스의 인스턴스 필드를 사용할 수 있다.(X)

	}

}
