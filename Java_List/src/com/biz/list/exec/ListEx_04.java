package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEx_04 {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<Integer>();

		Random rnd = new Random();

		for (int i = 0; i < 100; i++) {
			intList.add(rnd.nextInt(100) + 1);
		}
		/*
		 * intList.get(i) method
		 * public int get(int i) {
		 *        return x;
		 * }
		 */

		for (int i = 0; i < 100; i++) {
			int num = intList.get(i);
			if (num == 55) {
				System.out.println(num);
			}
		/*
		 * intList.get(i) method를 호출하여
		 * 값을 가져오는데 몇번 반복해서 실행해도
		 * 항상 같은 값이 return 될 것이다.
		 * 그럼에도 불구하고 아래 코드는 같은 일을
		 * 두번 실행하여 결과를 얻고 있다
		 * 짧은 코드이지만 상당히 비효율적인 코드가 될 수 있다.
		 * 
		 * get 자꾸 쓰지말고 일단 변수에 저장해서 써라. 	
		 */
		if(intList.get(i) == 55) {
			System.out.println(intList.get(i));
		}
			
		}

	}

}
