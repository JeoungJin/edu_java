package com.shinhan.day04.lab;

public class BookMgr {
	 Book[] booklist;

	public BookMgr(Book[] booklist) {
		super();
		this.booklist = booklist;
	}
	public void  printBookList() {
		for(Book b:booklist) {
			System.out.println(b.getTitle());
		}
	}
	public void printTotalPrice() {
		
	}
}
