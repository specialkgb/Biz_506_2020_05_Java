package com.biz.control;

public class For_06 {
	public static void main(String[] args) {
		
		int num = 0;
		int sum = 0;
		
		for(num = 0, sum = 0; num <= 10 ; num++) {
			sum += num;
		}
		System.out.println("결과" + sum);
		
		// 1부터 10까지 곱셈 결과를 보여라
		
		for(num =1, sum = 1; num <= 10 ; num++) {
			sum *= num;
		}
		System.out.println("결과" + sum);
	}

}
