package com.shinhan.day14.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class StreamTest {

	static List<Student> studentList = 
			List.of(
					new Student("홍길동1","남",92),
					new Student("홍길동3","여",88),
					new Student("홍길동2","여",98),
					new Student("홍길동4","남",77),
					new Student("홍길동5","남",50),
					new Student("홍길동6","남",50)
		           );
	
	public static void main(String[] args) {
		f5();
	}
	
	private static void f5() {
		Random random = new Random();
		List<Long> score = new ArrayList<Long>();
		LongStream.rangeClosed(0, 1000000000).forEach(i->{
			score.add(random.nextLong(101));
		});
		
		
		double avg = 0;
		long startTime = 0;
		long endtime = 0;
		
		startTime = System.nanoTime();		
		avg = score.parallelStream().mapToLong(i->i.longValue()).average().getAsDouble();		
		endtime = System.nanoTime();
		System.out.println(endtime-startTime+"ns parallelStream");
		// 510207101ns 일반스트림처리
		// 173255001ns parallelStream
		System.out.println("평균:" + avg);
		
	}
	
	private static void f4() {
		Random random = new Random();
		List<Long> score = new ArrayList<Long>();
		LongStream.rangeClosed(0, 1000000000).forEach(i->{
			score.add(random.nextLong(101));
		});
		
		
		double avg = 0;
		long startTime = 0;
		long endtime = 0;
		
		startTime = System.nanoTime();		
		avg = score.stream().mapToLong(i->i.longValue()).average().getAsDouble();		
		endtime = System.nanoTime();
		System.out.println(endtime-startTime+"ns 일반스트림처리");
		//55782700ns 일반스트림처리
		System.out.println("평균:" + avg);
		
	}

	private static void f3() {
		Map<String, Double > result = studentList.stream()
				.collect( Collectors.groupingBy(
						   s->s.getGender(),
						Collectors.averagingDouble(s->s.getScore())));
		System.out.println(result);
	}

	private static void f2() {
		//그룹
		Map<String, List<Student> > result = studentList.stream()
				.collect( Collectors.groupingBy(s->s.getGender()));
		
		List<Student> maleList = result.get("남");
		List<Student> femaleList = result.get("여");
		maleList.stream().forEach(st->System.out.println(st));
		System.out.println("-----------------------------");
		femaleList.stream().forEach(st->System.out.println(st));
		
		/*
		for(String key:result.keySet()) {
			System.out.println(key );
		}*/
		
		
	}

	public static void f1() {
		
		//남학생만 map으로 만들기 {"홍길동5":50}
		studentList.stream()
		    .filter(st->st.getGender().equals("남"))
		    .forEach(st->System.out.println(st)); 
		 
		Map<String, Integer> map =  studentList.stream()
	    .filter(st->st.getGender().equals("남"))
	    .collect(Collectors.toMap(st->st.getName(), st->st.getScore()));
		System.out.println(map);
		
		//[홍길동1,홍길동4,홍길동5]
		Set<Student> set =   studentList.stream()
	    .filter(st->st.getGender().equals("남"))
	    .collect(Collectors.toSet());
		
		set.forEach(s->System.out.println(s));
		
	}

}






