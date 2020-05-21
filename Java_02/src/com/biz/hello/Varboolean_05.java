package com.biz.hello;

public class Varboolean_05 {

	public static void main(String[] args) {

		int num1 =34;
		boolean bVar1 = (num1 % 2) == 0;
		
		if(bVar1 == true) {
		    System.out.println(num1 + "짝수입니다");	}
		
		if(bVar1 == false) {
			System.out.println(num1 + "는 짝수가 아닙니다");	}

		if(bVar1) {
			System.out.println("bVar1은 true입니다.");}
		
		if(!bVar1) {
			System.out.println("bVar1은 true가 아닙니다.");}

		if(num1 % 2 == 0) {
			System.out.println(num1 + "는 짝수");}
		
		if(num1 % 2 != 0) {
			System.out.println(num1 + "는 짝수가 아닙니다.");}
		
		if(num1 % 3 == 0) {
			System.out.println(num1 + "은 3의 배수");}
		
		if(num1 % 3 != 0) {
			System.out.println(num1 + "은 3의 배수가 아닙니다.");}
	}
	
}
