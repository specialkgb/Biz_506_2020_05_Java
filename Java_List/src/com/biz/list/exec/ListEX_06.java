package com.biz.list.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListEX_06 {

	public static void main(String[] args) {

		List<Character> charList = new ArrayList<Character>();

		Random rnd = new Random();

		// 알파벳 개수 : 대소문자 각 26개
		char char1 = (char) (rnd.nextInt(26) + 'A'); // A의 캐릭터 코드 값은 96이다.

		for (int i = 0; i < 100; i++) {
			charList.add((char) (rnd.nextInt(26) + 'A'));
		}

		for (int i = 0; i < charList.size() ; i++) {
			char char2 = charList.get(i);
			if (char2 == 'F') {
				System.out.printf("F는 %d번째에서 최초 생성", i);
				break;
			}
		}
		System.out.println();
		int charSize = charList.size();
		for(int i = 0 ; i < charSize ; i++) {
			char charGet = charList.get(i);
			if(charGet == 'F') {
				System.out.println(i + "번째에서 F를 찾음");
				break;
			}
			
		}

	}

}
