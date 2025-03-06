package com.shinhan.day07;

import java.util.HashSet;
import java.util.Objects;

//Object의 toString()=>   getClass().getName() + '@' + Integer.toHexString(hashCode())
class Phone extends Object{
	String model;
	String number;
	Phone(String model, String number){
		this.model = model;
		this.number = number;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		 builder.append("Phone [model=")
				.append(model)
				.append(", number=")
				.append(number)
				.append("]");
		return builder.toString();
	}
	@Override
	public boolean equals(Object obj) {
		Phone otherPhone = (Phone)obj;
		return number.equals(otherPhone.number);
	}
}

class Book extends Object{
	
	String title;
	int price;
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	void display() {
		System.out.println(title +"====" + price);
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [title=").append(title).append(", price=").append(price).append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		return Objects.hash(price, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return price == other.price && Objects.equals(title, other.title);
	}
	

}
public class OverideTest {

	public static void main(String[] args) {
		//배열 : 같은 타입의 여러값을 연속공간에 저장하기 위한 자료구조 , 개수가 한정적 
		//Collection : List, Set, Map 
		//List : 순서가 있음, 중복허용 
		//Set : 순서가 없음, 중복불가!!!! (equals, hashcode체크)-->HashSet
		HashSet<Book> datas = new HashSet<>();
		datas.add(new Book("aa", 1000));
		datas.add(new Book("bb", 1000));
		datas.add(new Book("bb", 1000));//X
		datas.add(new Book("aa", 1000));//X
		for(Book data:datas) {
			System.out.println(data);
		}
	}
	
	
	public static void f3(String[] args) {
		//배열 : 같은 타입의 여러값을 연속공간에 저장하기 위한 자료구조 , 개수가 한정적 
		//Collection : List, Set, Map 
		//List : 순서가 있음, 중복허용 
		//Set : 순서가 없음, 중복불가!!!! (equals, hashcode체크)-->HashSet
		HashSet<Integer> datas = new HashSet<>();
		datas.add(5);
		datas.add(4);
		datas.add(5);//X
		datas.add(4);//X
		datas.add(3);
		datas.add(100);
		for(Integer data:datas) {
			System.out.println(data);
		}
	}
	
	
	
	public static void f2(String[] args) {
		Book b1 = new Book("이것이 자바다1", 38000);
		Book b2 = new Book("이것이 자바다1", 38000);
		b1.display();
		System.out.println(b1);
		System.out.println(b1.equals(b2));
		
	}
	
	
	public static void f(String[] args) {
		Phone p1 = new Phone("겔럭시11", "010-4567-8956");
		Phone p2 = new Phone("겔럭시12", "010-4567-8956");
		
		System.out.println(p1); //객체의 toString()함수가 호출된다. 
		//System.out.println(p1.toString()); //객체를 대표하는 문자열이 return됨 
		System.out.println(p2);
		
		System.out.println(p1 == p2);  //주소비교 
		System.out.println(p1.equals(p2) );  //주소비교가 아닌 내용비교로 재정의 

	}

}
