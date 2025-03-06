package com.shinhan.day05;

//class의 객체가 오직 한번만 생성하고자한다. 
public class SingleTone {
	static SingleTone single;
	 private SingleTone() {
		 
	 }
	 public static SingleTone getInstance() {
		 if(single==null) single = new SingleTone();
		 return single;
	 }
}
