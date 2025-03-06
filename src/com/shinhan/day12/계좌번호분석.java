package com.shinhan.day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class 계좌번호분석 {
	
	 
	public static void main(String[] args) {
	 
		String[] accounts = {"4514--234495-1","305-44-291501",
				"1-2-34-495-8623","492134545151","623-421523-67-341",
				"-5439-59639921","6235-7X3+47-7456","98-76-543-210",
				"512-73-634901","000-999999-22-555","064-82-792561"};
	    solution(accounts);
	}

	private static void solution(String[] accounts) {
		HashMap<String, Integer> map = new HashMap<>();
		for(String acc:accounts) {
			//1.유효한지?//
			if(!isValid(acc)) continue;
			//2.같은은행계좌인지?패턴이 같으면 같은은행....갯수
			String bankName = getBackName(acc);
			map.put(bankName,  map.getOrDefault(bankName, 0)+1 );
		}
		//System.out.println(map);
		Collection<Integer> datas =  map.values();
		List<Integer> alist = new ArrayList<>(datas);
		Collections.sort(alist, Collections.reverseOrder());
		//System.out.println(alist);
		int[] arr = alist.stream().mapToInt(i->i).toArray();
		System.out.println(Arrays.toString(arr));
	}

	private static String getBackName(String acc) {
		//623-421523-67-341
		//=>3-6-2-3
		StringBuilder sb = new StringBuilder();
		String[] arr =  acc.split("-");
		for(String s:arr) {
			sb.append(s.length()+"-");
		}
		return sb.toString();
	}

	private static boolean isValid(String account) {
		// 규칙 1): 숫자와 '-' 만 포함(정규표현식으로 작성)
		if(!account.matches("[0-9-]+")) {
			return false;
		}
		// 규칙 2: 숫자는 11개 이상 14개 이하
		long count = account.chars().filter(c->Character.isDigit(c)).count();
		if(count<11L || count>14L) {
			return false;
		}
		// 규칙 3과 4: '-'는 0개 이상 3개 이하, 연속하지 않음, 시작과 끝에 없음
		long dashCount = account.chars().filter(c->c=='-').count();
		if(dashCount < 0 || dashCount > 3) {
			return false;
		}
		if(account.contains("--") || account.startsWith("-")|| account.endsWith("-")) {
			return false;
		}
		
		return true;
	}
}






