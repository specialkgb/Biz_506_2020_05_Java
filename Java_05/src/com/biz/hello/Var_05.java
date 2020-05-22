package com.biz.hello;

import java.util.Random;

public class Var_05 {
	public static void main(String[] args) {

		Random rnd = new Random();

		int num1 = rnd.nextInt(50) + 50;
		int num2 = rnd.nextInt(50) + 51;

		System.out.println(num1);
		System.out.println(num2);

		// 375 = (x + (x * 0.1)) 에서 x는 얼마인가?
	}

}
