package com.shinhan.day05;

import java.util.Arrays;
import java.util.Comparator;

//추상메서드는 정의는 있고 구현은 없다. 구현은 구현class가 한다. 
//interface는 추상메서드들로 이루어진다.
//Comparator는 interface :  
class MySort implements Comparator<Integer> {
	@Override
	public int compare(Integer a, Integer b) {
		// < = >
		// ascending : 앞-뒤
		// descending : 뒤-앞
		return b - a;
	}
}

public class 놀이공원티켓판매 {

	public static void main(String[] args) {
		f8();
	}

	public static void f8() {
		int[] tickets = { 10, 8, 20000 };
		int[][][] requests = { { { 2, 3 }, { 1, 7 }, { 2, 4 }, { 3, 5 } }, { { 1, 9 }, { 3, 6 }, { 2, 5 } },
				{ { 3, 1 }, { 2, 5 }, { 2, 10 }, { 3, 8 }, { 1, 2 } } };

		for (int testcast = 0; testcast < tickets.length; testcast++) {

			System.out.println("-------------------testcast[" + testcast + "]");
			int result = solution(tickets[testcast], requests[testcast]);
			System.out.println(result);

			for (int[] arr : requests[testcast]) {
				System.out.println(Arrays.toString(arr));
			}
		}
	}

	private static int solution(int ticketsSu, int[][] person) {
		Arrays.sort(person, (a, b) -> a[0] - b[0] == 0 ? b[1] - a[1] : a[0] - b[0]);
		int answer = 0;
		for(int[] arr:person) {
			if(ticketsSu >= arr[1]) {
				answer +=  arr[1];
				ticketsSu -= arr[1];
			}
		}
		return answer;
	}

	private static void f7() {
		Integer[][] arr2 = { { 2, 3 }, { 1, 7 }, { 2, 4 }, { 3, 5 } };
		print("=====before====", arr2);
		// Sort
		Arrays.sort(arr2, (a, b) -> a[0] - b[0] == 0 ? b[1] - a[1] : a[0] - b[0]);
		print("=====after====", arr2);
	}

	private static void f6() {
		Integer[][] arr2 = { { 2, 3 }, { 1, 7 }, { 2, 4 }, { 3, 5 } };
		print("=====before====", arr2);
		// Sort
		Arrays.sort(arr2, new Comparator<Integer[]>() {

			@Override
			public int compare(Integer[] a, Integer[] b) {
				int result = a[0] - b[0]; // asc
				if (result == 0)
					return b[1] - a[1]; // desc
				return result;
			}
		});
		print("=====after====", arr2);
	}

	private static void f5() {
		Integer[][] arr2 = { { 2, 3 }, { 1, 7 }, { 2, 4 }, { 3, 5 } };
		print("=====before====", arr2);
		// Sort
		for (int i = 0; i < arr2.length - 1; i++) {
			for (int j = i + 1; j < arr2.length; j++) {
				if (arr2[i][0] > arr2[j][0] || (arr2[i][0] == arr2[j][0] && arr2[i][1] < arr2[j][1])) {
					// 바꾸기
					Integer[] temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
		}
		print("=====after====", arr2);
	}

	private static void print(String title, Integer[][] arr2) {
		System.out.println(title);
		for (Integer[] arr1 : arr2) {
			System.out.println(Arrays.toString(arr1));
		}
	}

	private static void f4() {
		// 1차원배열의 정렬
		String[] arr = { "java", "web", "sql" };
		System.out.println("Arrays before:" + Arrays.toString(arr));
		// 기본sort는 Ascending이다.
		Arrays.sort(arr);
		System.out.println("Arrays after:" + Arrays.toString(arr));

	}

	private static void f3() {
		// 1차원배열의 정렬
		char[] arr = { 'a', 'A', 'z', 'c', 'f' };
		System.out.println("Arrays before:" + Arrays.toString(arr));
		// 기본sort는 Ascending이다.
		Arrays.sort(arr);
		System.out.println("Arrays after:" + Arrays.toString(arr));

	}

	private static void f2() {
		// 1차원배열의 정렬
		Integer[] arr = { 10, 3, 34, 50, 5 };
		System.out.println("Arrays before:" + Arrays.toString(arr));
		// 기본sort는 Ascending이다.
		// 1.구현class만들기
		// Arrays.sort(arr, new MySort());
		// 2.익명구현 class만들기
		/*
		 * Arrays.sort(arr,new Comparator<Integer>() {
		 * 
		 * @Override public int compare(Integer a, Integer b) { // TODO Auto-generated
		 * method stub return b-a; } });
		 */

		// 3.익명구현 class만들기 ...함수가 오직1개인 경우 람다표현식이 가능
		Arrays.sort(arr, (a, b) -> b - a);
		System.out.println("Arrays after:" + Arrays.toString(arr));

	}

	private static void f1() {
		// 1차원배열의 정렬
		int[] arr = { 10, 3, 34, 50, 5 };
		System.out.println("before:" + Arrays.toString(arr));
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				// Ascending(오름차순) : 내가(i) 더 크면 다음것과 바꾼다
				// Descending(내림차순)
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("after:" + Arrays.toString(arr));

	}

}
