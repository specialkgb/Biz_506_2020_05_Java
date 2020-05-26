package com.biz.grade;

import java.util.Random;

public class Grade_12 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int[] Num = new int[10];
		int Sum = 0;

		for (int i = 0; i < 10; i++) {

			Num[i] = rnd.nextInt(50) + 51;
			}

		for (int i = 0; i < 10; i++) {

		if (Num[i] % 2 == 0) {
			Sum += Num[i];
		}

		
			System.out.println(Sum);

		}

	}

}
