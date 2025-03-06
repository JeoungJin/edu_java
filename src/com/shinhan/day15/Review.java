package com.shinhan.day15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;



@ToString
@Getter
@AllArgsConstructor
class Member2 {
	private String name;
	private String job;
}
public class Review {
	public static void main(String[] args) {
		f4();
	}
	
	private static void f4() {
		List<Member2> list = Arrays.asList(
				 new Member2("홍길동", "개발자"),
				 new Member2("김나리", "디자이너"),
				 new Member2("신용권", "개발자")
		);
		//생산자, 소비자,소비자  
		Map<String, List<Member2>> groupingMap = list.stream()
				.collect(Collectors.groupingBy(m->m.getJob()));
				 
		System.out.println("[개발자]");
		groupingMap.get("개발자").stream().forEach(m->System.out.println(m));
		System.out.println("[디자이너]");
		groupingMap.get("디자이너").stream().forEach(m->System.out.println(m));
	    
	}
	private static void f3() {
		List<Member2> list = Arrays.asList(
				 new Member2("홍길동", "개발자"),
				 new Member2("김나리", "디자이너"),
				 new Member2("신용권", "개발자")
		);
		List<Member2> developers = list.stream().filter(m->m.getJob().equals("개발자")).toList();		 
		developers.stream().forEach(m -> System.out.println(m.getName()));
	}

	private static void f2() {
		List<Member> list = Arrays.asList(new Member("홍길동", 30), new Member("신용권", 40), new Member("감자바", 26));
		double avg = list.stream().mapToInt(m -> m.getAge()).average().orElse(0);
		System.out.println("평균 나이: " + avg);

	}

	private static void f1() {
		String[] arr = { "This is a java book", "Lambda Expressions", "Java8 supports lambda expressions" };
		List<String> list2 = Arrays.asList(arr);

		List<String> list = Arrays.asList("This is a java book", "Lambda Expressions",
				"Java8 supports lambda expressions");
		list.stream().filter(s -> s.toLowerCase().contains("java")).forEach(s -> System.out.println(s));

	}

}
//This is a java book
//Java8 supports lambda expressions
