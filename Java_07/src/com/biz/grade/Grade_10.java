package com.biz.grade;

import java.util.Random;

public class Grade_10 {

	public static void main(String[] args) {

		int[] intKorScore = new int[10];
		int[] intEngScore = new int[10];
		int[] intMathScore = new int[10];

		Random rnd = new Random();

		for (int i = 0; i < 10; i++) {
			intKorScore[i] = rnd.nextInt(50) + 51;
			intEngScore[i] = rnd.nextInt(50) + 51;
			intMathScore[i] = rnd.nextInt(50) + 51;

		}
		
		int intKorSum = 0;
		int intEngSum = 0;
		int intMathSum = 0;
		
		for (int i = 0; i < 10; i++) {
			
			
			intKorSum += intKorScore[i];
			intEngSum += intEngScore[i];
			intMathSum += intMathScore[i];
		
			System.out.println((i+1) + "번째 학생의 국어 점수 : " + intKorScore[i]);
			System.out.println((i+1) + "번째 학생의 영어 점수 : " + intEngScore[i]);
			System.out.println((i+1) + "번째 학생의 수학 점수 : " + intMathScore[i]);
			System.out.println("===========================");

		}
		
		System.out.println("국어 총점 : " + intKorSum);
		System.out.println("국어 평균 : " + intKorSum / 10);
		
		System.out.println("영어 총점 : " + intEngSum);
		System.out.println("영어 평균 : " + intEngSum / 10);
		
		System.out.println("수학 총점 : " + intMathSum);
		System.out.println("수학 평균 : " + intMathSum / 10);
		
	}

}