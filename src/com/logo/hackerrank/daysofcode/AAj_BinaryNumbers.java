package com.logo.hackerrank.daysofcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AAj_BinaryNumbers {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		System.out.println(countConsecutivrOneIntoBinary(n));

		scanner.close();
	}

	static int countConsecutivrOneIntoBinary(int number) {

		int totalOne = 0;
		int localOne = 0;

		while (number > 0) {
			if (number % 2 == 1) {
				localOne++;
			} else {
				if (localOne >= totalOne)
					totalOne = localOne;

				localOne = 0;
			}
			number = number / 2;
		}
		
		if (localOne >= totalOne)
			totalOne = localOne;

		return totalOne;
	}
}
