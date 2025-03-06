package com.shinhan.day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

//Collection : List, Set, Map
//List : 순서있음, 중복가능 .....ArrayList, Vector, LinkedList
//Set : 순서없음, 중복없음 .....HashSet, TreeSet
public class CollectionTest {

	public static void main(String[] args) {
		f6();
		 

	}
	
	private static void f6() {
		//Account class 중복check : hashCode(), equals() 재정의됨 
		//같은값은 저장안됨 
		HashSet<Account> data = new HashSet<>();
		data.add(new Account("123", "kim", 1000));
		data.add(new Account("123", "kim", 2000));
		data.add(new Account("124", "kim2", 3000));
		 
		for(Account s:data) {
			System.out.println(s);
		}
		
	}
	
	private static void f5() {
		//String class 중복check : hashCode(), equals() 재정의됨 
		HashSet<String> data = new HashSet<>();
		data.add("월");
		data.add("월");
		data.add("토");
		data.add("토");
		for(String s:data) {
			System.out.println(s);
		}
		
	}
	private static void print(List<String> alist) {
		for(String s:alist) {
			System.out.println(s);
		}
		
	}
	private static void f4() {
		List<String> alist = new Vector<>();
		alist.add("월");
		alist.add("토");
		alist.add("토");
		alist.add("일");
		print(alist);
		System.out.println(alist.contains("토"));
		System.out.println(alist.size() + " size");
		
		/*
		alist.sort(new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				// TODO Auto-generated method stub
				return a.compareTo(b);
			}
		});*/
		alist.sort((a,b)->b.compareTo(a));
		
		print(alist);
	}
	
	private static void f3() {
		List<String> alist = new LinkedList<>();
		alist.add("월");
		alist.add("토");
		alist.add("토");
		alist.add("일");
		print(alist);
		
	}
	
	private static void f2() {
		ArrayList<String> alist = new ArrayList<>();
		alist.add("월");
		alist.add("토");
		alist.add("토");
		alist.add("일");
		print(alist);
		
	}

	

	private static void f1() {
		ArrayList alist = new ArrayList();
		alist.add(100);
		alist.add("자바");
		alist.add(new Account("123", "lee", 1000));
		
		int a = (Integer) alist.get(0);
		String a2 = (String) alist.get(1);
		Account a3 = (Account) alist.get(2);
		
		
	}

}
