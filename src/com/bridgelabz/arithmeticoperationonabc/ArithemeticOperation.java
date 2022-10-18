package com.bridgelabz.arithmeticoperationonabc;
/* 1. Enter two numbers and do the following arithmetic
 *  Operations find max and min.
i) a+b*c ii) c+a/b
iii) a%b+c iV) a*b+c */

public class ArithemeticOperation {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		// i) a+b*c
		System.out.println("a+b*c: " + (a + b * c));
		// ii) c+a/b
		System.out.println("c+a/b: " + (c + a / b));
		// iii) a%b+c
		System.out.println("a%b+c: " + (a % b + c));
		// iV) a*b+c
		System.out.println("a*b+c: " + (a * b + c));
		int max = 0;
		if (a > max) {
			max = a;
			if (b > max) {
				max = b;
			}
			if (c > max) {
				max = c;
			}
		}
		System.out.println("The maximum number is: " + max);
	}
}
