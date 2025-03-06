package com.shinhan.day15;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class ServerExample {

	public static void main(String[] args) throws IOException {
		//이제부터 서비스를 제공하겠다.들어오는문은 (port)은  5001이다. 
		ServerSocket serverSocket = new ServerSocket(5001);
		System.out.println("[서버시작]");
		Socket socket  = serverSocket.accept();//대기, 클라이언트가오면 수락 
		//192.168.0.4
		
		
		//InettAddress<-InetSocketAddress
		InetSocketAddress addr = (InetSocketAddress)socket.getRemoteSocketAddress();
		System.out.println(addr.getHostName() + "연결 요청을 수락함 ");
		
		

	}

}





