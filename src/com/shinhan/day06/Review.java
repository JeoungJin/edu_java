package com.shinhan.day06;

public class Review {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		ProductVO[] productList = new ProductVO[5];
		productList[0] = new ProductVO("마이쭈", 25000, "Samsong");
		productList[1] = new ProductVO("꿈틀이", 32000, "Samsong");
		productList[2] = new ProductVO("마이쭈2", 20000, "Samsong");
		productList[3] = new ProductVO("마이쭈3", 15000, "Samsong");
		productList[4] = new ProductVO("고소미", 75000, "Daehoo");

		ProductVO[] result = selectProduct(productList, 25000);
		for (ProductVO p : result) {
		    if(p!=null) System.out.println(p);
		}
	}

	private static ProductVO[] selectProduct(ProductVO[] productList, int amount) {
		// 구현
		ProductVO[] arr = new ProductVO[productList.length];
		int index = 0;
		for (ProductVO p : productList) {
			if (p.price >= amount) {
				arr[index] = p;
				index++;
			}
		}
		return arr;
	}

}
/*
 * <<실행결과 >>
 * 
 * ProductVO [name=마이쭈, price=25000, maker=Samsong] ProductVO [name=꿈틀이,
 * price=32000, maker=Samsong] ProductVO [name=고소미, price=75000, maker=Daehoo]
 */