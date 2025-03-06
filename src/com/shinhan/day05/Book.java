package com.shinhan.day05;

import java.io.Serializable;

//DTO(Data Transfer Object) : data를 저장후 이동시 사용하는 객체 
//VO(Value Object) : data를 저장한다. C언어의 structure 와 비슷  
//field+constructor+getter/setter
public class Book implements Serializable{
	private String title;
	private int price;
	public Book() {}
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
 
