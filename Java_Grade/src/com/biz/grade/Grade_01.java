package com.biz.grade;

import java.util.Random;

public class Grade_01 {

	public static void main(String[] args) {
		
		int Students = 20;

		int[] intKorScore = new int[Students];
		int[] intEngScore = new int[Students];
		int[] intMathScore = new int[Students];
		int[] intMusicScore = new int[Students];
		int[] intArtScore = new int[Students];

		Random rnd = new Random();

		for (int i = 0; i < Students; i++) {

			intKorScore[i] = rnd.nextInt(100) + 1;
			intEngScore[i] = rnd.nextInt(100) + 1;
			intMathScore[i] = rnd.nextInt(100) + 1;
			intMusicScore[i] = rnd.nextInt(100) + 1;
			intArtScore[i] = rnd.nextInt(100) + 1;

		}

		int[] intStSum = new int[Students];
		int[] intAvg = new int[Students];

		for (int i = 0; i < Students; i++) {
			intStSum[i] = intKorScore[i];
			intStSum[i] += intEngScore[i];
			intStSum[i] += intMathScore[i];
			intStSum[i] += intMusicScore[i];
			intStSum[i] += intArtScore[i];
			
			intAvg[i] = intStSum[i]/5;

		}

		int intKorSubSum = 0;
		int intEngSubSum = 0;
		int intMathSubSum = 0;
		int intMusicSubSum = 0;
		int intArtSubSum = 0;

		for (int i = 0; i < Students; i++) {
			intKorSubSum += intKorScore[i];
			intEngSubSum += intEngScore[i];
			intMathSubSum += intMathScore[i];
			intMusicSubSum += intMusicScore[i];
			intArtSubSum += intArtScore[i];
		}

		System.out.println(
				"============================================================================================================");
		System.out.println("학번\t\t국어\t\t영어\t\t수학\t\t음악\t\t미술\t\t총점\t평균");

		System.out.println(
				"------------------------------------------------------------------------------------------------------------");
		for (int i = 0; i < Students; i++) {
			System.out.printf("%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t%d\t\n", i, intKorScore[i], intEngScore[i],
					intMathScore[i], intMusicScore[i], intArtScore[i], intStSum[i], intAvg[i]);
		}
		System.out.println(
				"============================================================================================================");
		System.out.printf("과목총점\t%d\t\t%d\t\t%d\t\t%d\t\t%d\n", intKorSubSum, intEngSubSum, intMathSubSum,
				intMusicSubSum, intArtSubSum);
		System.out.printf("과목평균\t%d\t\t%d\t\t%d\t\t%d\t\t%d\n", intKorSubSum / Students, intEngSubSum / Students,
				intMathSubSum / Students, intMusicSubSum / Students, intArtSubSum / Students);

	}

}
