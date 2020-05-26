package com.biz.grade;

import java.util.Random;

public class Grade_06 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int intSum = 0;

		for (int i = 1; i < 11; i++) {
			int intKor = rnd.nextInt(50) + 51;

			System.out.println(i + "번 학생 점수 : " + intKor);

			intSum += intKor;

		}
		System.out.println("학생 10명의 총점 : " + intSum);
		System.out.println("학생 10명의 평균 : " + intSum / 10);

	}

}
