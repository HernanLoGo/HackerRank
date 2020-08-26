package com.logo.hackerrank.daysofcode;

import java.util.Scanner;

public class AAG_Arrays {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		scanner.close();

		String listReverse = reverse(arr);

		System.out.println(listReverse);

	}

	private static String reverse(int[] arr) {
		String result = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			result = result + arr[i] + " ";
		}
		result = result.substring(0, result.length() - 1);
		return result;
	}

}
