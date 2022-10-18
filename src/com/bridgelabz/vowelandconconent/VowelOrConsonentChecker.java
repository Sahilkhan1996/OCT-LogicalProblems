package com.bridgelabz.vowelandconconent;

import java.util.Scanner;

public class VowelOrConsonentChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any character:");
		String input1 = sc.next();
		String inputModified = input1.toLowerCase();
		char input = inputModified.charAt(0);

		// Using Switch case
		switch (input) {
		case 'a':
			System.out.println("The input character is vowel");
			break;
		case 'e':
			System.out.println("The input character is vowel");
			break;
		case 'i':
			System.out.println("The input character is vowel");
			break;
		case 'o':
			System.out.println("The input character is vowel");
			break;
		case 'u':
			System.out.println("The input character is vowel");
			break;
		default:
			System.out.println("The input character is consonent");
		}
		
		//checking the same problem with if and else
		if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u') {
			System.out.println("The input character is vowel");
		} else {
			System.out.println("The input character is consonent");
		}
		sc.close();
	}
}
