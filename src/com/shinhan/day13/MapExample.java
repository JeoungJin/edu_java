package com.shinhan.day13;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		 Map<String,Integer> map = new HashMap<String,Integer>();
		 map.put("blue", 96);
		 map.put("hong", 86);
		 map.put("white", 92);
		 
		 String name = null; //최고 점수를 받은 아이디를 저장하는 변수
		 int maxScore = 0; //최고 점수를 저장하는 변수
		 int totalScore = 0; //점수 합계를 저장하는 변수
		 
		 //여기에 코드를 작성하세요.
		 for(String key:map.keySet()) {
			 int score = map.get(key);
			 totalScore += score;
			 if(score>maxScore) {
				 maxScore = score;
				 name = key;
			 }
		 }
		 System.out.println(name);
		 System.out.println(maxScore);
		 System.out.println(totalScore);
		 System.out.println((double)totalScore/map.keySet().size());
		}
}
