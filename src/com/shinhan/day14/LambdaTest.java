package com.shinhan.day14;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@FunctionalInterface
interface MyConsumer<T>{
	public void accept(T t);
}
@FunctionalInterface
interface MySupplier<T>{
	public T get();
}

public class LambdaTest {
	public static void main(String[] args) {
		f6();

	}

	private static void f6() {
		BiFunction<Student, String, Double> f = (a,b)->{
			System.out.println(b);
			return (a.getMathScore()+a.getEnglishScore())/2.0;	
		};
		Student s = new Student("kim", 100,90);
		double result = f.apply(s, "***");
		System.out.println(result);
	}

	private static void f5() {
		Function<Student, String> f = (st)->st.getName();
		Function<Student, Integer> f2 = (st)->st.getEnglishScore()+st.getMathScore();
		Student s = new Student("kim", 100,90);
		String result = f.apply(s);
		System.out.println(result);
		int result2 = f2.apply(s);
		System.out.println(result2);
		
	}

	private static void f4() {
		MySupplier<Integer> a = ()->{
			Student s = new Student("kim", 100,90);
			return s.getEnglishScore();
		}; 
		
		Supplier<Integer> b = ()->{
			Student s = new Student("kim", 100,90);
			return s.getEnglishScore();
		};
		int result = b.get();
		System.out.println(result);
		
		
		Supplier<String> b2 = ()->{
			Student s = new Student("kim", 100,90);
			return s.getName();
		};
		String result2 = b2.get();
		System.out.println(result2);
		
		
		
	}

	private static void f2() {
		//정의, 익명구현class, 람다표현
		BiConsumer<String, Student> consumer = (s, st)->{
			System.out.println(s);
			System.out.println(st.getName() + " 수학:" + st.getMathScore());
		};
		//사용
		consumer.accept("******", new Student("kim", 100,90));
		
	}

	private static void f1() {
		MyConsumer<Integer> a = new MyConsumer<Integer>() {
			public void accept(Integer t) {
				System.out.println(t/10);
			}
		};
		MyConsumer<String> a2 = (t)->System.out.println(t+"****"); 
		a.accept(100);
		a2.accept("100");
		
		Consumer<String> a3 = (t)->System.out.println(t+"!!!!"); 
		a3.accept("문자");
		
		Consumer<Student> a4 = (t)->System.out.println(t+"!!!!"); 
		a4.accept(new Student("홍길동", 100, 90));
		
	}

}
