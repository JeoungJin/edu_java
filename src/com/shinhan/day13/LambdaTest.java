package com.shinhan.day13;


//람다표현식이 가능한가?를 compile시에 체크하는 Annotation
//람다표현식은 Interface가 하나의 추상메서드만 가지고있는 경우 
@FunctionalInterface
interface MyInterface{
	void method1();
}

//1.구현class만들어서 사용하기 
class MyClassImpl implements MyInterface{
	public void method1() {
		System.out.println("1.구현class만들어서 사용하기 ");
	}
}

@FunctionalInterface
interface Workable{
	void work(String name, String job);
}

interface Speakable{
	void speak(String content);
}

interface MyCaculator{
	int add(int x, int y);
}




class Person3{
	//1.구현class 2.익명 3.람다 
	public void action(Workable workable) {
		workable.work("홍길동", "프로그래밍");
	}
	public void action2(Speakable speakable) {
		speakable.speak("안녕하세요");
	}
}
////////////////////////////////////////////////////
class Computer2{
	public static double staticMethod(double x, double y) {
		return x+y;
	}
	public double instanceMethod(double x, double y) {
		return x*y;
	}
}

//@FunctionalInterface
interface Calculable {
	double calc(double a, double b);
}

class Person4{
	//(x,y)->x-y
	public void action(Calculable calculable) {
		double result = calculable.calc(10, 4);
		System.out.println("result = " + result);
	}
}

interface Creatable{
	public abstract Board create(String title, String content);
}


public class LambdaTest {
	public static void main(String[] args) {
		f5();
	}
	private static void f5() {
		Creatable f = (a,b)->new Board(a,b);
		Creatable f3 = (a,b)->{return new Board(a,b);};
		Creatable f2 = Board::new;
		
		Board b = f2.create("수요일", "마지막시간");
		System.out.println(b.getTitle() + ":"+ b.getContent());
		
	}
	private static void f4() {
		Person4 p = new Person4();
		p.action((x,y)->x+y); //14
		p.action((x,y)->x-y); //10-4 = 6
		p.action(Computer2::staticMethod); //10+4
		Computer2 aa = new Computer2();
		p.action(aa::instanceMethod); //10*4
		p.action(Math::max); //10
		p.action(Math::min); //4
		
	}
	private static void f3() {
		MyCaculator cal = new MyCaculator() {
			public int add(int x, int y) {
				return x+y;
			}
		};
		MyCaculator cal2 = (x, y)->{return x+y;};
		MyCaculator cal3 = (x, y)->x+y;
		System.out.println(cal.add(1, 2));
		System.out.println(cal2.add(1, 2));
		System.out.println(cal3.add(1, 2));
	
		 
		
	}
	private static void f2() {
	   Person3 p1 = new Person3();
	   p1.action((a,b)->{
		   System.out.println(a + "님");
		   System.out.println(b + "....열심히");
	   });
	   p1.action((a,b)->{
		   System.out.printf("----%s:%s------\n", a, b);
	   });
	   p1.action2(a->System.out.println(a + "!!!!"));
	   p1.action2(a->{
		   System.out.println(a + "##");   
		   System.out.println(a + "^^");   
	   });
		
	}


	public static void f1() {
		work(new MyClassImpl());
		//2.익명구현class사용하기
		work(new MyInterface() {
			public void method1() {
				System.out.println("2.익명구현class사용하기");
			}
		});
		work(()->System.out.println("3.람다표현식"));
		work(()->{
			System.out.println("4.람다표현식----");
			System.out.println("4.람다표현식----");
			});

	}

	private static void work(MyInterface my) {
		my.method1();
		
	}

}
