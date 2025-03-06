package com.shinhan.day14;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		method20();

	}

	private static void method20() {
		List<String> alist = new ArrayList<>();
		alist.add("A");alist.add("BB");alist.add("CCC");alist.add("DDDD");alist.add("DDDDD");
		System.out.println(alist);
		//set바꾸기
		Set<String> aset = alist.stream().collect(Collectors.toSet());
		System.out.println(aset);
		//map으로바꾸기 
		Map<Integer,String> amap = 
				alist.stream().collect(Collectors.toMap(s->s.length(), s->s+"**"));
		
		//Map<Integer,String> amap = 
		//		alist.stream().collect(Collectors.toMap(String::length, Function.identity()));
		
		System.out.println(amap);
		
	}

	private static void method19() {
		List<Student> alist = new ArrayList<>();
		alist.add(new Student("신용권", 10, 120));
		alist.add(new Student("김용범", 20, 220));
		alist.add(new Student("박은자", 30, 320));
		alist.add(new Student("이태한", 40, 420));
		alist.add(new Student("신광진", 40, 520));
		
		int total1 = alist.stream().mapToInt(s->s.getEnglishScore()).sum();
		int total2 = alist.stream().mapToInt(s->s.getEnglishScore()).reduce(0, (a,b)->a+b);
		System.out.println(total1);
		System.out.println(total2);
		
		
	}

	private static void method18() {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		OptionalInt op = Arrays.stream(arr).filter(a->a%2==0).reduce((a,b)->a+b);
		int i = op.orElse(0);
		System.out.println(i);
		
	}

	private static void method17() {
		int[] arr = {21,41,61,7};
		//짝수가 몇개있는지?	
		long result = Arrays.stream(arr).filter(a->a%2==0).count();
		System.out.println("짝수개수:" + result);
		//합계
		long result2 = Arrays.stream(arr).filter(a->a%2==0).sum();
		System.out.println("합계:" + result2);
		
		OptionalDouble result3 = Arrays.stream(arr).filter(a->a%2==0).average();
		//double d = result3.getAsDouble();
		double d = result3.orElse(0);
		
		System.out.println("OptionalDouble:" + result3);
		System.out.println("합계:" + d);
		System.out.println("합계:" + (result3.isPresent()?result3.getAsDouble():0));
		
		//최대
		OptionalInt result4 = Arrays.stream(arr).filter(a->a%2==0).max();
		int i = result4.orElse(0);
		System.out.println(i);
		
		//첫번째요소 
		result4 = Arrays.stream(arr).filter(a->a%2==0).findFirst();
		i = result4.orElse(0);
		System.out.println(i);
	}

	private static void method16() {
		int[] arr = {2,4,6,7};
		
		boolean result = Arrays.stream(arr).allMatch(value->value%2==0);
		boolean result2 = Arrays.stream(arr).anyMatch(value->value%2==0);
		boolean result3 = Arrays.stream(arr).noneMatch(value->value%2==0);
 
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		
	}

	//루핑, 최종
	private static void method15() {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int total = Arrays.stream(arr)
		   .filter(i->i%2==0)
		   .peek(i->System.out.println(i))
		   .sum();
		System.out.println("짝수의 합:" + total);
		
		System.out.println("------------------------------------------");
		int[][] arr2 = {{10,20},{1,2,3,4,5,6,7,8,9,10},{1},{1,2,3}};
		total = Arrays.stream(arr2).filter(aa->aa.length>=2)
				   .flatMapToInt(a-> Arrays.stream(a))	 
		           //.mapToInt(a->a.length)
		           //.forEach(bb->System.out.println(Arrays.toString(bb)));
		           .peek(bb->System.out.println(bb)).sum();
		System.out.println("합계:" + total);
	}

	private static void method14() {
		List<Student> alist = new ArrayList<>();
		alist.add(new Student("신용권", 10, 120));
		alist.add(new Student("김용범", 20, 220));
		alist.add(new Student("박은자", 30, 320));
		alist.add(new Student("이태한", 40, 420));
		alist.add(new Student("신광진", 40, 520));
		
		alist.stream().sorted().forEach(st->System.out.println(st));
		System.out.println("---desc1---");
		alist.stream().sorted(Comparator.reverseOrder()).forEach(st->System.out.println(st));
		System.out.println("---desc2---");
		alist.stream().sorted((a,b)->b.getName().compareTo(a.getName())).forEach(st->System.out.println(st));
		 
	}

	private static void method13() {
		String account  = "112-1888451234--5";
		
		IntStream is = account.chars();
		account.chars().forEach(ch->System.out.println((char)ch));
		
		
		
		
		int total = IntStream.range(1, 11).sum();
		System.out.println(total);
		
	}

	private static void method12() {
		// 규칙 1: 숫자와 '-' 만 포함
		// 규칙 2: 숫자는 11개 이상 14개 이하
		// 규칙 3과 4: '-'는 0개 이상 3개 이하, 연속하지 않음, 시작과 끝에 없음

		String account  = "112-1888451234--5";
		if(!account.matches("[0-9-]+")) {
			System.out.println("규칙1 틀림");
		}
		long count = account.chars().filter(c->Character.isDigit(c)).count();
		if(count<11L || count>14L) {
			System.out.println("규칙2 틀림");
		}
		long dashCount = account.chars().filter(c->c=='-').count();
		if(dashCount < 0 || dashCount > 3) {
			System.out.println("규칙3 틀림");
		}
		if(account.contains("--") || account.startsWith("-")|| account.endsWith("-")) {
			System.out.println("규칙4 틀림");
		}
			
	}

	private static void method11() {
		List<String> list2 = Arrays.asList("10, 20","30, 40, 50"," 60, 70, 80, 90,100");
		
		//flatMapToInt : 들어간 값을 펼치기 , return은 int Stream 
		double d = list2.stream().flatMapToInt(s->{
			String[] arr = s.split(",");
			
			int[] intArr = new int[arr.length];
			for(int i=0;i<arr.length;i++) {
				intArr[i] = Integer.parseInt( arr[i].trim() );
			}
			return Arrays.stream(intArr);
		}).average().getAsDouble();
		//.forEach(i->System.out.println(i));
		System.out.println(d);
		
		double d2 = list2.stream().flatMapToInt(s-> 
			Arrays.stream(s.split(",")).mapToInt(a->Integer.parseInt(a.trim()))
		 ).average().getAsDouble();
		System.out.println(d2);
	}

	private static void method10() {
		List<String> alist = new ArrayList<>();
		alist.add("this is java");
		alist.add("i am a best developer");
		
		String str = "this is java";
		String[] arr = str.split(" ");
		Stream<String> st =  Arrays.stream(arr);
		
		
		alist.stream()
		//.mapToInt(s->s.length())
		.flatMap(s-> Arrays.stream(s.split(" ")))
		.forEach(s->System.out.println(s));
		
		
		
		
		
		
	}

	private static void method9() {
		int[] arr = {1,2,3,4,5,6};
		
		Arrays.stream(arr).asDoubleStream().forEach(a->System.out.println(a));
		//int->Integer (Boxing)
		Arrays.stream(arr).boxed().forEach(a->System.out.println(a));
		
		
	}

	private static void method8() {
		List<Student> alist = new ArrayList<>();
		alist.add(new Student("신용권", 10, 120));
		alist.add(new Student("김용범", 20, 220));
		alist.add(new Student("박은자", 30, 320));
		alist.add(new Student("이태한", 40, 420));
		alist.add(new Student("신광진", 40, 520));
		
		alist.stream().mapToInt(st->st.getEnglishScore()).forEach(i->System.out.println(i));
		alist.stream().mapToInt(st->st.getMathScore()).forEach(i->System.out.println(i));
		
		//스트림시작:alist.stream()
		//중간처리 : mapToInt(st->st.getEnglishScore()) 들어간객체를 int로 변경되어 내보내기 
		//최종처리 : average()
		//Optional ->기본형으로 변경 getAsDouble()
		double d = alist.stream().mapToInt(st->st.getEnglishScore()).average().getAsDouble();
		System.out.println(d);
	}

	private static void method7() {
		Predicate<Integer> f = a -> a>90;
		System.out.println(f.test(100));
		System.out.println(f.test(50));
		
		Predicate<Student> f2 = st -> st.getName().length()==3 ;
		boolean result  = f2.test(new Student("ABC",1,2));
		System.out.println(result);
		
		IntPredicate f3 = a -> a>90;
		System.out.println(f3.test(50));
		
	}

	private static void method6() {
		List<Student> alist = new ArrayList<>();
		alist.add(new Student("신용권", 10, 20));
		alist.add(new Student("김용범", 20, 20));
		alist.add(new Student("박은자", 30, 20));
		alist.add(new Student("이태한", 40, 20));
		alist.add(new Student("신광진", 40, 20));
		
		//alist.stream().distinct().forEach(st->System.out.println(st));
		
		//filter : 이름이 "신"으로 시작
		alist.stream().filter(st->st.getName().startsWith("신")).forEach(st->{
			System.out.println(st);
		});
		System.out.println("=========================");
		//filter : 영어점수가 30이상 
		//predicate : 조건에 맞는가?true,false
		//filter : true인것만 선택 
		alist.stream().filter(st->st.getEnglishScore()>=30)
		              .forEach(st->System.out.println(st));
		
		
		System.out.println("=========================");
		//외부반복자 
		for(Student st:alist) {
			if(st.getName().startsWith("신")) {
				System.out.println(st);
			}
		}
		
	}

	private static void method5() {
		List<Student> alist = new ArrayList<>();
		alist.add(new Student("A", 10, 20));
		alist.add(new Student("B", 20, 20));
		alist.add(new Student("C", 30, 20));
		alist.add(new Student("D", 40, 20));
		
		//alist.stream().forEach(st->System.out.println(st));
		
		alist.parallelStream().forEach(st->{
			System.out.println(Thread.currentThread().getName() + ":" + st);
		});
		
		//시작: alist.stream()
		//중간처리:mapToInt()   map은 변형 
		//최종처리:average()
		OptionalDouble op = alist.stream().mapToInt(st->st.getEnglishScore()).average();
		//double result = op.getAsDouble(); 
		double result = op.orElse(0);
		System.out.println(result);
		
	}

	private static void method4() {
		try {
			Path path = Paths.get(StreamTest.class.getResource("aa.txt").toURI());
			System.out.println(path);
			//파일을 스트림으로 얻는 방법
			Files.lines(path).forEach(a->{
				System.out.println(a);
			});
			
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void method3() {
		IntStream.range(1, 11).forEach(i->System.out.println(i));
		IntStream.rangeClosed(1, 10).forEach(i->System.out.println(i));
		
		
		
	}

	 

	private static void method2() {
		//내부반복자 
		String[] arr = {"A","B","C","D"};
		int[] arr2 = {10,20,30,40,50};
		List<Student> alist = new ArrayList<>();
		Set<Student> aset = new HashSet<>();
		
		alist.add(new Student("A", 10, 20));
		alist.add(new Student("B", 20, 20));
		alist.add(new Student("C", 30, 20));
		alist.add(new Student("D", 40, 20));
		
		aset.add(new Student("A", 10, 20));
		aset.add(new Student("B", 20, 20));
		aset.add(new Student("C", 30, 20));
		aset.add(new Student("D", 40, 20));
		
		
		Arrays.stream(arr).forEach(a->{
			System.out.println(a);
		});
		
		Arrays.stream(arr2).forEach(i->System.out.println(i));
		
		alist.stream().forEach(st->{
			System.out.println(st);
		});
		
		aset.stream().forEach(st->{
			System.out.println(st);
		});
		
		
		
	}

	private static void method1() {
		//외부반복자
		String[] arr = {"A","B","C","D"};
		for(String s:arr) {
			System.out.println(s);
		}
		
		List<String> alist = List.of(arr); 
		Iterator<String> it = alist.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
