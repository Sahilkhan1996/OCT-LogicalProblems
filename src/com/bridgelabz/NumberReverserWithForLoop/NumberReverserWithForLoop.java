package com.bridgelabz.NumberReverserWithForLoop;

import java.util.Scanner;

public class NumberReverserWithForLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any number to reverse: ");
		int input = sc.nextInt();
		int reverse = 0;
		for(int i=input; i>0; i=i/10) {
			// adding the last number id the reserve
			int lastDigit = i % 10;
			reverse = (reverse * 10) + lastDigit;

			// removing the last digit from the input
		}
		System.out.println("Reverse of the number is: "+reverse);
		sc.close();
	}
}
