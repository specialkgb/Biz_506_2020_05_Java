package com.biz.hello;

import java.util.Random;

public class Var_17 {
	
	public static void main(String[] args) {
		
		/*
		 * 변수 이름 짓기
		 * 변수 이름 첫글자는 영문소문자
		 * 변수 이름은 이름만으로 하는 일을 유추할 수 있도록 짓는다.
		 */
		int intKorScore;
		int intEngScore;
		int intMathScore;

		Random rnd = new Random();
		
		intKorScore = rnd.nextInt(50) + 51;
		intEngScore = rnd.nextInt(50) + 51;
		intMathScore = rnd.nextInt(50) + 51;
		
		int intSum = 0;
		int intAvg = 0;
		
		intSum = intKorScore;
		intSum += intEngScore;
		intSum += intMathScore;
		
		intAvg = intSum / 3;
		
		System.out.println("총점 : " + intSum);
		System.out.println("평균 : " + intAvg);
		
		
	}

}
