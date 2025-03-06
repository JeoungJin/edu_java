package com.shinhan.day10;

import java.util.Arrays;
import java.util.HashSet;

//주사위
class Dice {
	int size;

	Dice(int size) {
		this.size = size;
	}

	int play() {
		//Math.random() : 0<=   <1 
		//Math.random() * 8 : 0<=   <8
		//(int) (Math.random() * size) + 1 : 1<=   <9 
		int number = (int) (Math.random() * size) + 1;
		return number;
	}
}

public class DiceGame {
	public static void main(String args[]) {
		
		//1~45
		//0<=   <1
		//0<=   <45.
		//1<=   <46
		//중복없이 1~45인 6개의 무작위수를 구하기 (배열, HashSet)
		//HashSet : 순서없음 , 중복불가 
		HashSet<Integer> set = new HashSet<Integer>();
		while(set.size()<6) {
			int su = (int)(Math.random()*45) + 1;
			set.add(su);
		}
		System.out.println(set);
		
		//배열
		int[] arr = new int[6];
		int index=0;
		aa:while(index<6) {
			int su = (int)(Math.random()*45) + 1;
			for(int i=0; i<index ;i++) {
				if(su == arr[i]) continue aa;
			}
			arr[index++] = su;
		}
		System.out.println(Arrays.toString(arr));
		
		
		/*
		DiceGame game = new DiceGame();

		int result1 = game.countSameEye(10);
		System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result1);

		int result2 = game.countSameEye(-10);
		System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result2);
        */
	}

	int countSameEye(int n) {
		// 구현
		try {
			if(n<0) {
				throw new IllegalArgumentException("던진횟수는 음수불가");
				//IllegalArgumentException : unchecked Exception 
			}
		}catch(IllegalArgumentException aa) {
			System.out.println(aa.getMessage());
			return 0;
		}
		Dice d1 = new Dice(8);
		Dice d2 = new Dice(8);
		int count=0;
		for(int i=1;i<=n;i++) {
			int su1 = d1.play();
			int su2 = d2.play();
			System.out.println(su1 + "----" + su2);
			if(su1==su2) count++;
		}
		return count;
	}
}





