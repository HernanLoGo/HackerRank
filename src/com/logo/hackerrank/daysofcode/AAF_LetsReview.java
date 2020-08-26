package com.logo.hackerrank.daysofcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AAF_LetsReview {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		List<String> inputList = new ArrayList<>();

		int numberCases = 0;
		numberCases = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		inputList = readInput(numberCases);

		scanner.close();
		
		if (inputList.isEmpty()) {
			return;
		}

		for (String s : inputList) {
			print(s.toCharArray());
		}

	}

	private static void print(char[] arr) {
		String even = "";
		String odd = "";

		for (int i = 0; i < arr.length; i++) {
			if (isOdd(i)) {
				odd = odd + arr[i];
			} else {
				even = even + arr[i];
			}
		}

		System.out.println(even + " " + odd);

	}

	private static List<String> readInput(int numberCases) {
		List<String> inputList = new ArrayList<>();
		for (int i = 0; i < numberCases; i++) {
			inputList.add(scanner.nextLine());
		}
		return inputList;
	}

	private static boolean isOdd(int n) {
		return n % 2 != 0 ? Boolean.TRUE : Boolean.FALSE;
	}

}
