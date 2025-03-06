package com.shinhan.day10;


import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	public static void main(String[] args) {
		FileWriter2 fw = null;
		try {
			fw = new FileWriter2("file.txt");
			fw.write("Java");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
			}
		}
		
		System.out.println("-------------개선------------------");
		try(FileWriter2 fw2 = new FileWriter2("file.txt")) {			 
			fw2.write("Java");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			 
		}
		System.out.println("----------진짜 파일저장-----------");
	 
		//자동 자원반납 
		try(FileWriter writer = new FileWriter("myfile.txt")) {
		 
			writer.write("파일에 문자를 저장하기1\n");
			writer.write("파일에 문자를 저장하기2\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			 
		}
		
		
		
	}
}
