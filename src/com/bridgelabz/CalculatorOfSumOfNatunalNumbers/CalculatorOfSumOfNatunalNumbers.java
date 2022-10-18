//input=5;
//O/P:1+2+3+4+5
package com.bridgelabz.CalculatorOfSumOfNatunalNumbers;

import java.util.Scanner;

public class CalculatorOfSumOfNatunalNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any natural number: ");
		int input = sc.nextInt();
		int i = 1;
		while (i < input) {
			System.out.print(i + "+");
			i++;
		}
		System.out.println(input);
		sc.close();
	}

}
