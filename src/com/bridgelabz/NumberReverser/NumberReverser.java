package com.bridgelabz.NumberReverser;

import java.util.Scanner;

public class NumberReverser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any number to reverse: ");
		int input = sc.nextInt();
		int reverse = 0;
		while (input != 0) {
			// adding the last number id the reserve
			int lastDigit = input % 10;
			reverse = (reverse * 10) + lastDigit;

			// removing the last digit from the input
			input = input / 10;
		}
		System.out.println(reverse);
		sc.close();
	}
}
