package com.shinhan.day13;

import java.util.TreeSet;

public class TreeSetExample {
	public static void f1(int a) {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	public static void main(String[] args) {
		f1(100);
		
		TreeSet<Student2> treeSet = new TreeSet<Student2>();
		treeSet.add(new Student2("blue", 96));
		treeSet.add(new Student2("hong", 86));
		treeSet.add(new Student2("white", 92));

		Student2 student = treeSet.last();
		System.out.println("최고 점수: " + student.score);
		System.out.println("최고 점수를 받은 아이디: " + student.id);
	}
}
