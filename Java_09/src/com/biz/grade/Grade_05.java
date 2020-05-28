package com.biz.grade;

import com.biz.score.Student;

public class Grade_05 {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		
		// Student 클래스에 선언된 make() 메서드를 호출하기
		// student.make();
		/*
		 * public class Student {
		 *      String strName = "홍길동";
		 *      public void make() {
		 *         strName = "이몽룡";
		 *         }
		 *         ?? strName => 이몽룡
		 *         
		 *         public String getName() {
		 *             return strName;
		 *             }
		 *         }
		 */
		
		// String strN = student.getName();
		// System.out.println(strN);
		int sum = 0;
		for (int i = 0; i < 100000000; i++) {
			sum = 100;
		}
		System.out.println(sum);
		//sum은 얼마??
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(sum);
		}
		
	}

}