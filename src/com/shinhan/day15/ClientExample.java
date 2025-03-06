package com.shinhan.day15;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientExample {

	public static void main(String[] args) throws UnknownHostException, IOException {
        //클라이언트는 IP, PORT
		Socket socket = new Socket("192.168.0.4", 5001);
		System.out.println("클라언트 연결성공");
		
		socket.close();
		System.out.println("클라언트 연결끊음");

	}

}
