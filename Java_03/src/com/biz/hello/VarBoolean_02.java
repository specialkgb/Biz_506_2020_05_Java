package com.biz.hello;

public class VarBoolean_02 {

	public static void main(String[] args) {
		int num1 = 9;
		int num2 = 3;
		boolean bVar = ((num1 + num2) % 2 == 0);
		if (bVar == true) {
			System.out.println((num1 + num2) + " = " + "짝수");
		}
		
		boolean bVar2 = ((num1 - num2) % 2 == 0);
		if (bVar2 == true) {
			System.out.println((num1 - num2) + " = " + "짝수");
		}
		
		boolean bVar3 = ((num1 * num2) % 2 == 0);
		if (bVar3 == true) {
			System.out.println((num1 * num2) + " = " + "짝수");
		}
		
		boolean bVar4 = ((num1 / num2) % 2 == 0);
		if (bVar4 == true) {
			System.out.println((num1 / num2) + " = " + "짝수");
		
	}

}}
