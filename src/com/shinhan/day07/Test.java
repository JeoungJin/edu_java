package com.shinhan.day07;

public class Test {

	public static void main(String[] args) {
		long answer = solution2(3);
		System.out.println(answer);

	}
	private static int solution2(int n) {
		long start = System.nanoTime();
		int result = 0;
		
		// i를 나머지로 생각해서 풀이
		for(int i=1; i<n; i++) {
			//System.out.printf("%d*%d+%d\n", i, n, i );
			result += i*n + i;
		}
		
		/* 첫번째로 문제를 직관적으로만 풀이한 결과
		int i=n+1;
		
		while(true) {
			if(i/n == i%n) { 
				result += i;
			}
			
			if(++i/n >= n)
				break;
		}*/
		long end = System.nanoTime();
		System.out.println("걸린시간:" + (end - start) + "ns");
		return result;
	}
	public static long solution(long n) {
		long start = System.nanoTime();
		long answer = 0;
		for (int i = 0; i < 100000; i++) {
			if (i / n == i % n) {
				answer += i;
			}
		}
		long end = System.nanoTime();
		System.out.println("걸린시간:" + (end - start) + "ns");
		return answer;
	}

	private static void f2() {
		// 1~100
		int i = 100;
		long start = System.nanoTime();
		int total = i * (i + 1) / 2;

		long end = System.nanoTime();
		System.out.println("걸린시간:" + (end - start) + "ns");
		System.out.println("1~100 합계=" + total);
	}

	private static void f1() {
		// 1~100
		long start = System.nanoTime();
		int total = 0;
		for (int i = 1; i <= 100; i++) {
			total += i;
		}
		long end = System.nanoTime();
		System.out.println("걸린시간:" + (end - start) + "ns");
		System.out.println("1~100 합계=" + total);
	}

}
