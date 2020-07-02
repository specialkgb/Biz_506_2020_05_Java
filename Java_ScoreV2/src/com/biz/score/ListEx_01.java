package com.biz.score;

import java.util.ArrayList;
import java.util.List;

public class ListEx_01 {
	
	public static void main(String[] args) {
		
		// 객체(인스턴스)들의 묶음 객체
		// List<제네릭:Generic> 리스트에 포함된 객체가 무엇인가를 명시
		List<String> strList; // String 객체(문자열)이 요소로 포함된 리스트다
		
		strList = new ArrayList<String>();
		
		strList.add("Korea");
		strList.add("대한민국");
		strList.add("우리나라만세");
		
		int size = strList.size();
		for(int i = 0 ; i < size ; i++) {
			String str = strList.get(i);
			System.out.println(str);
		}
		
		strList.add("이몽룡");
		strList.add("성춘향");
		strList.add("장보고");
		
		size = strList.size();
		for(int i = 0 ; i < size ; i++) {
			System.out.println(strList.get(i));
		}
		
		// 아래 for 문에서 strList.size()로 지정해서 조건문을 넣을 경우 strList의 사이즈를 알아보기 위해
		// size() method를 for문을 실행하는 동안 계속 해서 size() 측정을 위해 불필요한 연산을 하게 되어
		// 속도와 메모리 측면에서 비효율적이다
		for(int i = 0 ; i < strList.size() ; i++) {
			System.out.println(strList.get(i));
		}
		
		// 개수를 1번만 조회하고 for 반복문을 수행하기 때문에 위의 코드 보다 효율적이다.
		// 하지만 개수를 조회하는 코드를 생략하면 List의 개수가 변경되었을 경우,
		// for 반복문 연산 수행에 문제가 발생할 수 있다.
		size = strList.size();
		for(int i = 0 ; i < size ; i++) {
			System.out.println(strList.get(i));
		}
		
		// List 전체에 대해서 for 반복문을 수행할 경우 사용할 수 있는 향상된 for문이다.
		// 명칭은 향상된 for, 확장형 for, for each문이라고 한다.
		// 1. strList 개수만큼 알아서 for가 반복된다.
		// 2. for가 반복되면서 strList.get(현재) 를 str 변수에 할당
		// 3. for 반복문 내에서 str변수 값을 읽어서 사용할 수 있다.
		for(String str : strList) {
			System.out.println(str);
		}
		
		int[] intArray = new int[100];
		for(int i : intArray) {
			System.out.println(i);
		}
		
		
		
	}
}
