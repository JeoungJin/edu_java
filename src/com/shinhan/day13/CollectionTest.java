package com.shinhan.day13;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import java.util.Map.Entry;
import java.util.NavigableSet;

import com.shinhan.day12.Account;
import lombok.AllArgsConstructor;
import lombok.ToString;

interface AA{
	interface BB{
		
	}
}
@ToString
@AllArgsConstructor
class Person implements Comparable<Person>{
	String name;
	int age;
	@Override
	public int compareTo(Person obj) {
		// TODO Auto-generated method stub
		return obj.age - age;
	}
}


public class CollectionTest {

	public static void main(String[] args) {
		f17();
	}
	//Collection<---Set<---TreeSet
	private static void f17() {
		TreeSet<Person> data = new TreeSet<>();
		data.add(new Person("김1",20));
		data.add(new Person("김5",30));
		data.add(new Person("김2",40));
		data.add(new Person("김4",50));
		data.add(new Person("김3",60));
	    for(Person p : data){
			System.out.println(p);
		}
	     
	}

	private static void f16() {
		//TreeSet : 중복없음(hashcode(), equals())
		//          비교가능(Comparable를 반드시 구현되어야함)
		TreeSet<Integer> data = new TreeSet<Integer>();
		data.add(100); 
		data.add(300); 
		data.add(400); 
		data.add(500); 
		data.add(500); 
		for(Integer s:data) {
			System.out.println(s);
		}
		System.out.println("desc----");
		NavigableSet<Integer> navi = data.descendingSet();
		for(Integer s:navi) {
			System.out.println(s);
		}
		System.out.println("first:" + data.first());
		System.out.println("last:" + data.last());
		System.out.println("lower:" + data.lower(400));
		System.out.println("higher:" + data.higher(400));
		System.out.println("floor:" + data.floor(450));//floor버림
		System.out.println("floor:" + data.ceiling(450));//ceiling올림
	
		System.out.println("---tailSet");
		NavigableSet<Integer> navi2 = data.tailSet(400, true);
		for(Integer s:navi2) {
			System.out.println(s);
		}
		System.out.println("---subSet");
		//100<=   <400
		NavigableSet<Integer> navi3 =data.subSet(100, true, 400, false);
		for(Integer s:navi3) {
			System.out.println(s);
		}
		
	}

	private static void f15() {
		//검색을 강화한 Collection : Tree????		
		//중복불가, 순서있음(넣을때 비교해서 이진트리로 순서유지 ) 
		TreeSet<Computer> data = new TreeSet<>();
		data.add(new Computer("A2", 500)); 
		data.add(new Computer("A1", 100)); 
		data.add(new Computer("A1", 100)); //X
		data.add(new Computer("A4", 100)); 
		data.add(new Computer("A3", 400)); 
		for(Computer s:data) {
			System.out.println(s);
		}
		
		
		
		
		System.out.println("first:" + data.first());
		System.out.println("last:" + data.last());
		System.out.println("lower:" + data.lower(new Computer("A1", 100)));
		System.out.println("higher:" + data.higher(new Computer("A1", 100)));
		System.out.println("floor:" + data.floor(new Computer("A2", 500)));
		
	}
	
	private static void f14() {
		//검색을 강화한 Collection : Tree????		
		//중복불가, 순서있음(넣을때 비교해서 이진트리로 순서유지 ) 
		TreeSet<Integer> data = new TreeSet<Integer>();
		data.add(100); 
		data.add(300); 
		data.add(400); 
		data.add(500); 
		data.add(500); 
		for(Integer s:data) {
			System.out.println(s);
		}
		
	}
	
	private static void f13() {
		//검색을 강화한 Collection : Tree????
		TreeSet<String> data = new TreeSet<String>();
		data.add("월요일");
		data.add("화요일");
		data.add("수요일");
		data.add("목요일");
		data.add("금요일");
		data.add("토요일");
		data.add("일요일");
		data.add("일요일");
		for(String s:data) {
			System.out.println(s);
		}
		
	}

	private static void f12() {
		//ArrayList, LinkedList : 동기화처리안됨
		//Vector : 멀티쓰레드에 안정적(동기화처리됨)
		Vector<Integer> data = new Vector<>();
		Thread a = new Thread() {
			@Override
			public void run() {
				for(int i=1; i<=1000; i++) {
					data.add(i);
				}
			}
		};
		Thread b = new Thread() {
			@Override
			public void run() {
				for(int i=1001; i<=2000; i++) {
					data.add(i);
				}
			}
		};
		a.start();b.start();
		try {
			a.join();b.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("list에 저장된 data갯수:"+ data.size());
	}
	
	private static void f11() {
		//HashMap : 동기화처리안됨
		//Hashtable : 멀티쓰레드에 안정적(동기화처리됨)
		Map<String, Integer> data = new Hashtable<String, Integer>();
		Thread a = new Thread() {
			@Override
			public void run() {
				for(int i=1; i<=1000; i++) {
					data.put(String.valueOf(i), i);
				}
			}
		};
		Thread b = new Thread() {
			@Override
			public void run() {
				for(int i=1001; i<=2000; i++) {
					data.put(String.valueOf(i), i);
				}
			}
		};
		a.start();b.start();
		try {
			a.join();b.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("map에 저장된 data갯수:"+ data.size());
	}

	private static void f10() {
		Properties pro = new Properties();
		
			
		try {
			pro.load(CollectionTest.class.getResourceAsStream("oracleDB.properties"));
		
			for(Object key:pro.keySet()) {
				
				String s = (String) pro.get(key);
				System.out.println(key + "==>" + s);
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private static void f9() {
		//Set, List : 값 여러개를 저장
		//Map : 구현Map->HashMap, HashTable,Properties           Key, Value의 쌍이다 . Key는 set이다.  
		Map<String, Integer> data = new HashMap<>();
		data.put("홍길동3", 100);
		data.put("홍길동1", 200);//O
		data.put("홍길동1", 700);//덮어쓰기 
		data.put("홍길동5", 300);
		data.put("홍길동2", 400);
		data.put("홍길동4", 500);
		
		Integer score = data.get("홍길동1");
		System.out.println(score);
		System.out.println("-keySet이용----------------------");
		Set<String> keys = data.keySet();
		for(String key:keys) {
			score = data.get(key);
			System.out.println(key + "---->" + score);
		}
		System.out.println("-EntrySet이용----------------------");
		Set<Entry<String, Integer>> entrys = data.entrySet();
		for(Entry<String, Integer> entry:entrys) {
			System.out.println(entry.getKey() + "---->" + entry.getValue());
		}
		System.out.println("--------더 간단히---------");
		for(Entry<String, Integer> entry:data.entrySet()) {
			System.out.println(entry.getKey() + "---->" + entry.getValue());
		}
		System.out.println("-----------values--------");
		Collection<Integer> datas =   data.values();
		System.out.println(datas);
		
		System.out.println(data.containsKey("홍길동2"));
		System.out.println(data.containsValue(400));
		
		
	}

	private static void f8() {
		Set<String> data = new HashSet<>();
		data.add("월요일");
		data.add("화요일");
		data.add("수요일");
		data.add("목요일");
		data.add("금요일");
		data.add("토요일");
		data.add("일요일");
		data.add("일요일");
		//반복자 iterator 
		
		Iterator<String> it = data.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("======향상for는 Iterator 이용");
		for(String s:data) {
			System.out.println(s);
		}
		
		
	}

	private static void f7() {
		Set<String> data = new HashSet<>();
		Set<Computer> data2 = new HashSet<>();
		data.add("커피");
		data.add("오렌지");
		System.out.println(data.contains("커피"));
		System.out.println(data.contains("커피2"));
		
		//동일성체크한다. 같은객체가 있으면 add불가 
		data2.add(new Computer("A", 100));
		data2.add(new Computer("B", 100));
		//동일성체크한다
		System.out.println(data2.contains(new Computer("A", 100)));
		System.out.println(data2.contains(new Computer("A", 200)));
		System.out.println(data2.contains(new Computer("B", 200)));
		System.out.println(data2.contains(new Computer("C", 200)));
		
		
	}

	private static void f6() {
		Set<Computer> data = new HashSet<>();
		data.add(new Computer("ABC", 100));
		data.add(new Computer("DDD", 100));
		data.add(new Computer("ABC", 200));//X
		display2("HashSet...Computer", data);
		
		System.out.println(data.contains(new Computer("DDD", 100)));
		System.out.println(data.contains(new Computer("AAA", 100)));
		
	}

	private static void f5() {
		Set<Account> data = new HashSet<>();
		data.add(new Account("123", "kim", 1000));//O
		data.add(new Account("123", "kim", 2000));//X
		data.add(new Account("123", "kim", 3000));//X
		data.add(new Account("123", "kim", 4000));//X
		data.add(new Account("124", "kim", 4000));//O
		data.add(new Account("125", "park", 4000));//O
		
		display2("HashSet", data);
	 
		
	}
	
	private static void f4() {
		Set<String> data = new HashSet<>();
		data.add("월요일");
		data.add("화요일");
		data.add("수요일");
		data.add("목요일");
		data.add("금요일");
		data.add("토요일");
		data.add("일요일");
		data.add("일요일");
		display2("HashSet", data);
	 
		
	}

	private static void f3() {
		//List:ArrayList, LinkedList, Vector
		//   ArrayList :중간 삽입,삭제시 비 효율적, 마지막추가시 효율
		//   LinkedList:중간 삽입,삭제시 ArrayList보다 효율적
		//   Vector : MultiThread환경에서 안정적 (Synchronized지원)
		//Set : HashSet(순서없음,중복허용안함), TreeSet
		List<String> data = new Vector<>();
		data.add("월요일");
		data.add("화요일");
		data.add("수요일");
		data.add("목요일");
		data.add("금요일");
		data.add("토요일");
		data.add("일요일");
		data.add("일요일");
		display("Vector이용하기",data);
	}
	

	private static void f2() {
		//List:ArrayList, LinkedList, Vector
		//Set : HashSet, TreeSet
		LinkedList<String> data = new LinkedList<>();
		data.add("월요일");
		data.add("화요일");
		data.add("수요일");
		data.add("목요일");
		data.add("금요일");
		data.add("토요일");
		data.add("일요일");
		data.add("일요일");
		display("LinkedList이용하기",data);
	}

	
	private static void f1() {
		//List interface: 구현class => ArrayList, LinkedList, Vector
		//Set : HashSet, TreeSet
		ArrayList<String> data = new ArrayList<>();
		data.add("월요일");
		data.add("화요일");
		data.add("수요일");
		data.add("목요일");
		data.add("금요일");
		data.add("토요일");
		data.add("일요일");
		data.add("일요일");
		display("ArrayList이용", data);
	}

	private static void display2(String title, Set<?> data) {
		System.out.println("***********" + title + "***************");
		 
		
		System.out.println("--------------향상된 for문 이용------------------");
		for(Object s:data) {
			System.out.println(s);
			if(s instanceof Account acc) {
				acc.deposit(2000);
				System.out.println("잔고:" + acc.getBalance());
				 
			}
		}
		
	}
	
	private static void display(String title, List<String> data) {
		System.out.println("***********" + title + "***************");
		System.out.println("--------------일반 for문 이용------------------");
		for(int i=0; i<data.size(); i++) {
			System.out.println(data.get(i));
		}
		
		System.out.println("--------------향상된 for문 이용------------------");
		for(String s:data) {
			System.out.println(s);
		}
		
	}

}






