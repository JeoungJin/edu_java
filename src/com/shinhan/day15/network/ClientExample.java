package com.shinhan.day15.network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
    public static void main(String[] args) {
        Socket socket = null;

        try {
            socket = new Socket("192.168.0.4", 5001);
            System.out.println("[연결 요청]");
            //socket.connect(new InetSocketAddress("localhost", 5001));
            System.out.println("[연결 성공]");

            byte[] bytes = null;
            String message = null;
            OutputStream os = socket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            message = "Hello Server(client보냄)";
            //bytes = message.getBytes("UTF-8");
            //os.write(bytes);
            //os.flush();
            dos.writeUTF(message);
            
            System.out.println("[데이터 보내기 성공]");

            InputStream is = socket.getInputStream();
            
            //bytes = new byte[100];
            //int readByteCount = is.read(bytes);
            //message = new String(bytes, 0, readByteCount, "UTF-8");
            
            DataInputStream dis = new DataInputStream(is);
            message = dis.readUTF();
            
            System.out.println("[데이터 받기 성공] " + message);

            os.close(); is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (!socket.isClosed()) {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
