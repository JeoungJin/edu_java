package com.shinhan.day15;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkTest {

	public static void main(String[] args) throws UnknownHostException {
		f1();

	}

	private static void f1() throws UnknownHostException {
		//내pc
		InetAddress local = InetAddress.getLocalHost();
		System.out.println("내ip:" + local);
		
		
		InetAddress[] arr = InetAddress.getAllByName("www.naver.com");
		Arrays.stream(arr).forEach(addr->System.out.println(addr));
		
	}

}
