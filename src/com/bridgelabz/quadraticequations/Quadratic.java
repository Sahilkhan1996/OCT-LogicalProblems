package com.bridgelabz.quadraticequations;
import java.util.Scanner;

public class Quadratic {
	public static void main(String[] Strings) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of a: ");
		double a = sc.nextDouble();
		System.out.print("Enter the value of b: ");
		double b = sc.nextDouble();
		System.out.print("Enter the value of c: ");
		double c = sc.nextDouble();
		sc.close();
		// declared the two roots
		double firstroot, secondroot;

		// determinant (b^2 - 4ac)
		double delta = b * b - 4 * a * c;
		System.out.println("delta: " + delta);

		// check if determinant is greater than 0

		// two real and distinct roots
		firstroot = (-b + Math.sqrt(delta)) / (2 * a);
		secondroot = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.println("First root: " + firstroot);
		System.out.println("First root: " + secondroot);

	}

}