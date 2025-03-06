package com.shinhan.day05.exercise;

//업무로직을 작성 : Service
public class MemberService {
	void logout(String id) {
		System.out.println(id + "님 로그아웃되었습니다.");
	}

	boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("1234")) {
			return true;
		} else {
			return false;
		}
	}
	boolean login(Member member) {
		if (member.id.equals("hong") && member.password.equals("1234")) {
			return true;
		} else {
			return false;
		}
	}
	
}
