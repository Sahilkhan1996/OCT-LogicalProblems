package com.bridgelabz.palindrome;

import java.util.Scanner;

public class PalindromeChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any number to check palindrome: ");
		int input = sc.nextInt();
		int reverse = 0;
		for (int i = input; i > 0; i = i / 10) {
			// adding the last number id the reserve
			int lastDigit = i % 10;
			reverse = (reverse * 10) + lastDigit;//121

			// removing the last digit from the input
		}
		// checking if the numbers are palindrome
		if (input == reverse) {
			System.out.println("Number are palindrome");
		} else {
			System.out.println("Number are not palindrome");
		}
		sc.close();
	}
}
