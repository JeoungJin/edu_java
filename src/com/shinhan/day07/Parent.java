package com.shinhan.day07;

//자바는 최상위class :Object
public class Parent extends Object{
   int a=10;
   Parent(){
	   System.out.println("부모의 생성자");
   }
   void method1() {
	   System.out.println("부모의 메서드 method1()");
   }
}
