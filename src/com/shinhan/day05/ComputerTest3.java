package com.shinhan.day05;

//java ComputerTest3

public class ComputerTest3 {

	public static void main(String[] args) {
		System.out.println(Computer.count + "대"); //0
		Computer c1 = new Computer();
		Computer c2 = new Computer("abc","win");
		Computer c3 = new Computer("ddd","linux",1000);
		System.out.println(Computer.count + "대");//3

	}

}
