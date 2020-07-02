package com.biz.addr.exec;

public class Number_Ex {
	
	public static void main(String[] args) {
		
		/*
		 * 숫자형 wrapper class의 valueOf() method를 사용하면
		 * 숫자형 문자열을 숫자형 데이터로 변환 시킬 수 있다.
		 */
		// Integer.valueOf() : 숫자형 문자열을 정수로 변환시키는 method
		Integer.valueOf("34"); // 정수 34
		
		Float.valueOf("34.3");
		Double.valueOf("34.3");
		Long.valueOf("333333");
		
		// parseType 함수는 구버전 함수이기 때문에 지금은 많이 쓰이지 않는다
		// 초창기에는 valueOf의 처리 속도가 느렸으나 지금은 개선되어 거의 차이가 없다.
		Integer.parseInt("34");
		Float.parseFloat("34.3");
		Double.parseDouble("34.3");
		Long.parseLong("3333");
		
		
		// 아래와 같은 경우는 모두 NumberFormatException을 일으키는 코드
		Integer.valueOf(""); // 입력 값이 없이 엔터만 입력해버리는 경우
		
		Integer.valueOf("34 "); // 숫자 앞, 뒤에 white space 문제
		Integer.valueOf("A34"); // 숫자 앞, 뒤에 숫자형 이외의 문자열이 있는 경우
		Integer.valueOf("3 4"); // 숫자 중간에 space, 숫자형 이외의 문자열이 있는 경우
		Integer.valueOf("3+4"); // 하나의 문자열이 연산식 처럼 보일 때
		
	}
}