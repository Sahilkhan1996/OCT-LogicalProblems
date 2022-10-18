//input=5;
//O/P:1+2+3+4+5
package com.bridgelabz.CalculatorOfNumbersWithForLoop;

import java.util.Scanner;

public class CalculatorOfNumbersWithForLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any natural number: ");
		int input = sc.nextInt();

		for (int i = 1; i < input; i++) {
			System.out.print(i + "+");
		}
		System.out.println(input);
		sc.close();
	}

}
