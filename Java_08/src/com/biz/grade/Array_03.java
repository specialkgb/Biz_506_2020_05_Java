package com.biz.grade;

public class Array_03 {

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 0;

		for (int i = 1; i < 100; i++) {
			if (i % 2 == 0) {
				num1++;
			}
		}
		for (int j = 2; j < 100; j++) {
			if (j % 3 == 0) {
				num2++;
			}
		}

		System.out.println("짝수는 " + num1 +"개");
		System.out.println("3의 배수는 " + num2 +"개");
	}
}
