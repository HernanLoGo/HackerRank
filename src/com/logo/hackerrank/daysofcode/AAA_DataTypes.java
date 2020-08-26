package com.logo.hackerrank.daysofcode;

import java.util.Scanner;

public class AAA_DataTypes {

	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		/* Declare second integer, double, and String variables. */
		int variableInt = 0;
		double variableDouble = 0d;
		String variableString = "";
		/* Read and save an integer, double, and String to your variables. */
		// Note: If you have trouble reading the entire String, please go back and
		// review the Tutorial closely.
		variableInt = scan.nextInt();
		variableDouble = scan.nextDouble();
		scan.nextLine();
		variableString = scan.nextLine();
		/* Print the sum of both integer variables on a new line. */
		System.out.println(i + variableInt);
		/* Print the sum of the double variables on a new line. */
		System.out.println(d + variableDouble);
		/*
		 * Concatenate and print the String variables on a new line; the 's' variable
		 * above should be printed first.
		 */
		System.out.println(s + variableString);
		scan.close();
	}
}
