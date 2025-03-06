package com.shinhan.day12;

public class FindCharacters {
	public static void main(String[] args) {
		FindCharacters fc=new FindCharacters();
		int count=fc.countChar("Boys, be ambitious", 'b');
		System.out.println(count);
	}
	public int countChar(String str, char c) {
		//작성 
		//문자열의 각 내용들을 비교하여 입력받는 char c의 값과 동일한 char의 개수를 리턴한다.
		//대소문자는 각각 다른 것으로 간주한다.
		//for(int i=0; i<str.length(); i++) {}
		int count=0;
		char[] arr =  str.toCharArray();
		for(char ch:arr) {
			//if(ch==c) count++;
			if(Character.toLowerCase(c) == Character.toLowerCase(ch)) count++;
		}
		return count;
	}
}






