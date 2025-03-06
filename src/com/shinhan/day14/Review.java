package com.shinhan.day14;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

//함수가 1개인 인터페이스는 람다표현식을 사용할수있다. 
//@FunctionalInterface
interface MyInterface {
	public abstract void method();
}

//1.구현class
class Myclass implements MyInterface {
	public void method() {
		System.out.println("1.구현class");
	}
}

class MyRunnableImpl implements Runnable {
	public void run() {
		System.out.println("1.구현class");
	}
}

class Button {
	// 정적 멤버 인터페이스(함수형 인터페이스)
	@FunctionalInterface
	public static interface ClickListener {
		void onClick();
	}

	private ClickListener clickListener;

	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}

	public void click() {
		this.clickListener.onClick();
	}
}

interface Function2 {
	double apply(double a, double b);
}

//@FunctionalInterface
interface Function3<T> {
	public double apply(T t);
}
//(객체)->double return 

@FunctionalInterface
interface Operator {
	public int apply(int x, int y);
}

public class Review {
	private static int[] scores = { 10, 50, 3 };
	private static Student[] students = { new Student("홍길동", 90, 96), new Student("신용권", 95, 93) };

	public static void main(String[] args) {
		//double englishAvg = avg(s -> s.getEnglishScore());
		double englishAvg = avg( new Function3<Student>() {

			@Override
			public double apply(Student t) {
				// TODO Auto-generated method stub
				return t.getEnglishScore();
			}
		});
		
		System.out.println("영어 평균 점수: " + englishAvg);

		double mathAvg = avg(s -> s.getMathScore());
		System.out.println("수학 평균 점수: " + mathAvg);
		
		double mathAvg2 = avg(new Function3<Student>() {
			public double apply(Student t) {
				return t.getMathScore();
			}
		});
		System.out.println("수학 평균 점수: " + mathAvg2);
		
		
		
	}

	private static double avg(Function3<Student> f) {
		double total = 0;
		for(Student st:students) {
			total += f.apply(st);
		}
		return total / students.length;
	}

	public static void f7() {
		// 최대값 얻기
		// int max = maxOrMin((a,b)->a>b?a:b);
		/*
		 * int max = maxOrMin(new Operator() { public int apply(int x, int y) { if(x>y)
		 * return x; return y; } } );
		 */
		int max = maxOrMin(Math::max);

		System.out.println("최대값: " + max);

		// 최소값 얻기
		int min = maxOrMin(Math::min);
		System.out.println("최소값: " + min);
	}

	public static int maxOrMin(Operator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.apply(result, score);
		}
		return result;
	}

	public static double calc(Function2 fun) {
		double x = 10;
		double y = 4;
		return fun.apply(x, y);
	}

	private static void f6() {
		// double result = calc( (x, y) -> (x / y) );
		/*
		 * double result = calc(new Function() {
		 * 
		 * @Override public double apply(double a, double b) { // TODO Auto-generated
		 * method stub return a+b; } });
		 */
		double result = calc((aa, bb) -> aa - bb);
		System.out.println("result: " + result);

	}

	private static void f5() {
		Button btnOk = new Button();
		btnOk.setClickListener(new Button.ClickListener() {
			public void onClick() {
				System.out.println("구현class");
			}
		});
		btnOk.click();

		Button btnCancel = new Button();
		btnCancel.setClickListener(() -> {
			System.out.println("lambda");
		});
		btnCancel.click();

	}

	private static void f4() {

		Thread thread = new Thread(new Runnable() {
			public void run() {
				System.out.println("2.익명구현class");
			}
		});
		Thread thread2 = new Thread(() -> System.out.println("3.람다"));
		thread2.start();

	}

	private static void f3() {
		// 2.익명구현...즉시실행
		(new MyInterface() {
			public void method() {
				System.out.println("2.익명구현");
			}
		}).method();

		MyInterface a = new MyInterface() {
			public void method() {
				System.out.println("2.익명구현");
			}
		};
		a.method();

		MyInterface b = () -> {
			System.out.println("2.익명구현");
		};
		b.method();

	}

	private static void f2() {
		// List<Person> a = new ArrayList<>();
		// Set<Person> a = new HashSet<>();
		// Map<Person, Integer> a = new HashMap<>();
		/*
		 * Map<Person, Integer> a = new TreeMap<>(new Comparator<Person>() {
		 * 
		 * @Override public int compare(Person o1, Person o2) { // TODO Auto-generated
		 * method stub return o1.age - o2.age; } });
		 */
		Map<Person, Integer> a = new TreeMap<>((o1, o2) -> o1.age - o2.age);

		a.put(new Person("A", 10), 100);
		a.put(new Person("D", 20), 100);
		a.put(new Person("C", 40), 100);
		a.put(new Person("E", 30), 100);
		a.put(new Person("B", 50), 100);
		a.put(new Person("B", 50), 100);
		for (Person p : a.keySet()) {
			System.out.println(p + "-->" + a.get(p));
		}

	}

	private static void f1() {
		// List<Integer> a = new ArrayList<>();
		// List<Integer> a = new LinkedList<>();
		// List<Integer> a = new Vector<>();
		// Set<Integer> a = new HashSet<>();
		// Set<Integer> a = new TreeSet<>();
		Set<Integer> a = new TreeSet<>((o1, o2) -> o2 - o1);
		a.add(10);
		a.add(30);
		a.add(50);
		a.add(40);
		a.add(20);
		a.add(20);
		System.out.println(a);

		// Array : 연속공간, 같은타입, 고정개수
		// Collection interface : 연속공간 or 연속공간X, 같은타입 or X, 동적
		// List interface: 넣는순서가있음(index), 중복허용.... , ArrayList, LinkedList, Vector
		// Set interface : 넣는순서가없음, 중복허용X(add시 check---hashCode(), equals 같으면 넣지않음)
		// HashSet, TreeSet(add시 비교해서 순서대로 넣는다
		// Comparable혹은 Comparator의 compare())
		// Map interface : Key,Value의 쌍 , Key는 Set이다 (Key가 같으면 덮는다)

	}

}
