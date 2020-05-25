package com.biz.hello;

import java.util.Random;

public class Var_13 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int sum = 0;
		for (int i = 0; i < 100; i++) {
			int num = rnd.nextInt(100) + 1;
			sum += num;
		}
		// num 변수는 for() {} 내에서 선언되었기 때문에
		// for() {} 반복문이 끝나면 소멸되지만
		// sum 변수는 for() 명령문이 시작되기 전에 선언되었기 때문에
		// for() {} 반복문이 끝나도 변수를 읽기, 쓰기 할 수 있고
		// for() {} 반복문 내에서 sum += num 명령으로 만들어진
		// sum 변수의 값은 유지된다.
		System.out.println("100개의 임의 수 합계 : " + sum);
	}

}
