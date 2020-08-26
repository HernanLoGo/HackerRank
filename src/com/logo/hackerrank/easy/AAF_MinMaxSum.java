package com.logo.hackerrank.easy;

public class AAF_MinMaxSum {

	static void miniMaxSum(int[] arr) {

		long sum = 0l;
		long max = arr[0];
		long min = arr[0];

		for (int value : arr) {
			sum += value;
		}

		for (int value : arr) {
			if (value > max)
				max = value;
			if (value < min)
				min = value;
		}

		System.out.println((sum - max) + " " + (sum - min));

	}

	public static void main(String[] args) {
		int[] arr = { 1, 	2, 3, 4, 5, 6, 7, 8, 9, 10 };
		miniMaxSum(arr);
	}
}
