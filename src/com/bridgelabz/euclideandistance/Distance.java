package com.bridgelabz.euclideandistance;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of x: ");
		double x = sc.nextDouble();
		System.out.print("Enter the value of y: ");
		double y = sc.nextDouble();
		double squareOfX=Math.pow(x, x);
		System.out.println("square of x: "+squareOfX);
		double squareOfY=Math.pow(y, y);
		System.out.println("square of y: "+squareOfY);
		double result=Math.sqrt((squareOfX)+(squareOfY));
		System.out.println("Euclidean distance: "+result);
		sc.close();
	}
}
