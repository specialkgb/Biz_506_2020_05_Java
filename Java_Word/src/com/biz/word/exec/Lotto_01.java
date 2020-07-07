package com.biz.word.exec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto_01 {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<Integer>();

		for (int i = 0; i < 45; i++) {

			intList.add(i + 1);
		}

		System.out.println("시간 날 때 사보시던가~");
		
		int cnt = 0;

		for (int k = 0; k < 7777777; k++) {
			Collections.shuffle(intList);
			for (int i = 0; i < 6; i++) {
				System.out.print(intList.get(i) + "\t");
			}
			cnt ++;
			System.out.println(cnt + " 번째의 행운");
		}
		System.out.print("\n꼭 부자되세요\n");
		
	}

}
