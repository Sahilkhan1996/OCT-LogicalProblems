package com.bridgelabz.NumbersToPlaceValueConvertor;

import java.util.Scanner;

public class NumbersToPlaceValueConvertor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number from 1,10,100,1000: ");
		int input = sc.nextInt();
		if (input == 1) {
			System.out.println("unit");
		}
		if (input == 10) {
			System.out.println("Tens");
		}
		if (input == 100) {
			System.out.println("Hundreds");
		}
		if (input == 1000) {
			System.out.println("Thousands");
		} else {
			System.out.println("Only allowed the number 1,10,100,1000");
		}
		sc.close();
	}

}
