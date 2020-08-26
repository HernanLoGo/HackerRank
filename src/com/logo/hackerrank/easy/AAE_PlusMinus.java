package com.logo.hackerrank.easy;

import java.text.DecimalFormat;

public class AAE_PlusMinus {

	static void plusMinus(int[] arr) {

		double positive = 0;
		double negative = 0;
		double zero = 0;
		double size = arr.length;

		for (int eachArr : arr) {
			if (eachArr > 0) {
				positive++;
			} else if (eachArr < 0) {
				negative++;
			} else {
				zero++;
			}
		}

		DecimalFormat formato = new DecimalFormat("0.000000");
		System.out.println(formato.format(positive / size));
		System.out.println(formato.format(negative / size));
		System.out.println(formato.format(zero / size));
	}

	public static void main(String[] args) {

		int arr[] = { 1, 3, 1, 1, 4, 1 };

		plusMinus(arr);

	}
}
