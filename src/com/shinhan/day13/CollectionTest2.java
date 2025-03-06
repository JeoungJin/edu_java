package com.shinhan.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter
class Person2 implements Comparable<Person2> {

	String name;
	int age;

	// Set은 같으면 add안됨(여기)
	// Map은 같으면 덮어쓴다.
	@Override
	public int compareTo(Person2 obj) {
		// 0은같다 , : Ascending : 음수, 0, 양수
		if (age == obj.age)
			return obj.name.compareTo(name); // 이름으로 desc
		return age - obj.age; // 나이가 같으면 안들어감 (Set)
	}

}

@ToString
@AllArgsConstructor
class Fruit {
	String name;
	int price;
}

class MyFruit implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}

@EqualsAndHashCode
@ToString
@AllArgsConstructor
class Coin {
	int value;
}

public class CollectionTest2 {
	public static void main(String[] args) {
		f14();
	}
	
	private static void f14() {
		long a = System.nanoTime();
		//List<String> data1 = new ArrayList<String>();
		List<String> data1 = new LinkedList<String>();
		for(int i=0; i<=10000000; i++) {
			data1.add(i, String.valueOf(i));
		}
		
		for(int i=10; i<=200; i++) {
			                //ArrayList  1191917600ns
			data1.remove(i);//LinkedList 1525736700ns
		}
		
		
		long b = System.nanoTime();
		System.out.println(b-a + "ns");
	}

	private static void f13() {
		String[] arr = {"자바","오라클","프레임워크"};
		List<String> data1 = Arrays.asList(arr);
		//data1.add("---");
		System.out.println(Arrays.toString(arr));
		System.out.println(data1);
		
		System.out.println(arr[0]);
		System.out.println(data1.get(0));
		
	}

	private static void f12() {
		Map<String,Integer> data1 = new HashMap<>();
		data1.put("A",1);data1.put("B",2);data1.put("C",3);
		
		Map<String,Integer> data2 = Map.copyOf(data1);
		//data2.put("D",1);
		System.out.println(data2);
		
	}
	
	private static void f11() {
		Set<String> data1 = new HashSet<String>();
		data1.add("A");data1.add("B");data1.add("C");
		
		Set<String> data2 = Set.copyOf(data1);
		//data2.add("D");
		System.out.println(data2);
		
	}
	
	private static void f10() {
		List<String> data1 = new ArrayList<String>();
		data1.add("A");data1.add("B");data1.add("C");
		
		List<String> data2 = List.copyOf(data1);
		//data2.add("D");
		System.out.println(data2);
		
	}
	private static void f9() {
		Map<String,Integer> data = Map.of("A", 100, "B", 200, "D", 300, "C", 400);
		//data.put("E", 555);
		for(String key:data.keySet()) {
			System.out.println(key + "===" + data.get(key));
		}
		
	}
	public static void f8() {
		//List<Integer> data =  List.of(100,200,300);
		Set<Integer> data =  Set.of(400,100,200,300);
		
		//수정불가 
		//data.add(500);
		
		for(Integer i:data) {
			System.out.println(i);
		}
		
		
	}
	
	private static void f7() {

		// ArrayList, LinkedList : 동기화처리안됨
		// ---->Collections.synchronizedList() 동기화처리 가능 
		// Vector : 멀티쓰레드에 안정적(동기화처리됨)
		List<Integer> data = Collections.synchronizedList(new ArrayList<Integer>());
		Thread a = new Thread() {
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					data.add(i);
				}
			}
		};
		Thread b = new Thread() {
			@Override
			public void run() {
				for (int i = 1001; i <= 2000; i++) {
					data.add(i);
				}
			}
		};
		a.start();
		b.start();
		try {
			a.join();
			b.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("list에 저장된 data갯수:" + data.size());
	}

	private static void f6() {
		// Queue interface : 구현class ....LinkedList, , , , ,
		Queue<Coin> data = new LinkedList<>();
		data.offer(new Coin(300));
		data.offer(new Coin(500));
		data.offer(new Coin(100));
		data.offer(new Coin(200));

		// while(data.size()>0) {
		while (!data.isEmpty()) {
			System.out.println(data.poll());
		}
		System.out.println("Queue비어있음");

	}

	private static void f5() {
		// Stack class : LIFO
		Stack<Coin> data = new Stack<>();
		data.push(new Coin(100));
		data.push(new Coin(100));
		data.push(new Coin(100));
		data.push(new Coin(200));

		// while(data.size()>0) {
		while (!data.isEmpty()) {
			System.out.println(data.pop());
		}
		System.out.println("Stack비어있음");
	}

	private static void f4() {
		// Stack class : LIFO
		Stack<String> data = new Stack<String>();
		data.push("월");
		data.push("화");
		data.push("수");

		while (data.size() > 0) {
			System.out.println(data.pop());
		}
		System.out.println("Stack비어있음");
	}

	private static void f3() {
		/*
		 * TreeMap<Fruit, Integer> map = new TreeMap<>( new Comparator<Fruit>() {
		 * 
		 * @Override public int compare(Fruit o1, Fruit o2) { // TODO Auto-generated
		 * method stub return o1.price - o2.price; } });
		 */
		TreeMap<Fruit, Integer> map = new TreeMap<>((o1, o2) -> o1.price - o2.price);
		map.put(new Fruit("A1", 1000), 1);
		map.put(new Fruit("A3", 2000), 2);
		map.put(new Fruit("A4", 4000), 3);
		map.put(new Fruit("A5", 3000), 4);
		map.put(new Fruit("A2", 5000), 5);

		for (Fruit fruit : map.keySet()) {
			System.out.println(fruit + "---" + map.get(fruit));
		}

	}

	private static void f2() {
		// Map<---TreeMap, HashMap,......
		Map<Person2, Integer> map = new HashMap<>();
		TreeMap<Person2, Integer> data = new TreeMap<>();
		data.put(new Person2("A1", 10), 100);
		data.put(new Person2("A4", 20), 300);
		data.put(new Person2("A2", 20), 400);
		data.put(new Person2("A3", 30), 200); // O-->X
		data.put(new Person2("A5", 50), 2000);// 같은키가 있으면 Map은 덮어쓰기 O

		System.out.println(data.firstKey());
		System.out.println(data.firstEntry());
		System.out.println(data.lastKey());
		System.out.println(data.lastEntry());
		System.out.println("--------------------------------------");
		NavigableMap<Person2, Integer> navi = data.descendingMap();
		for (Entry<Person2, Integer> entry : navi.entrySet()) {
			System.out.println(entry.getKey() + "--" + entry.getValue());
		}

	}

	private static void f1() {
		// Map<---TreeMap, HashMap,......
		Map<String, Integer> map = new HashMap<>();
		TreeMap<String, Integer> data = new TreeMap<>();
		data.put("A1", 100);
		data.put("A2", 300);
		data.put("A3", 400);
		data.put("A4", 200); // O-->X
		data.put("A4", 2000);// 같은키가 있으면 Map은 덮어쓰기 O

		System.out.println(data.firstKey());
		System.out.println(data.firstEntry());
		System.out.println(data.lastKey());
		System.out.println(data.lastEntry());
		System.out.println("--------------------------------------");
		NavigableMap<String, Integer> navi = data.descendingMap();
		for (Entry<String, Integer> entry : navi.entrySet()) {
			System.out.println(entry.getKey() + "--" + entry.getValue());
		}

	}

}
