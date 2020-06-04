package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx_02 {
	
	public static void main(String[] args) {
		
		
		List<Integer> intList = new ArrayList<Integer>();
		Random rnd = new Random();
		
		int sum = 0;
		int num = rnd.nextInt();
		for(int i = 0 ; i < 100 ; i ++) {
			// 1~100 까지 난수(임의의 숫자)를 발생하여
			int num1 = rnd.nextInt(100) + 1;
			// intList에 추가하라
			intList.add(num1);
		}
		// size() 100이 되고 정수값이 100개 추가된 intList 된다.
		
		for(int i = 0 ; i < 100 ; i++) {
			// i번째 위치의 값을 읽어서 리스트에 추가하고 덧셈하라.
			sum += intList.get(i);
		}
		System.out.println("합계" + sum);
		
		
	}

}
