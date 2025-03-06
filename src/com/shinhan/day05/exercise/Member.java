package com.shinhan.day05.exercise;

//DTO(Data Transfer Object) : data전달 
//VO(Value Object) : 값저장
public class Member {
   //1.field
	String name;
	String id;
	String password;
	int age;
	
	public Member(String name, String id){
		this.name = name;
		this.id = id;
	}
	public Member(String id, String password,int age){
		this.id = id;
		this.password = password;
		this.age = age;
	}
}
