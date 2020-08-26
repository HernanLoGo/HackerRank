package com.logo.hackerrank.easy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AAA_CompareTheTriplets {

	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

		List<Integer> result = new ArrayList<>();
		Integer resultA = 0;
		Integer resultB = 0;
		for (int i = 0, j = 0; i <= 2; i++, j++) {
			if (a.get(i) > b.get(j)) {
				resultA++;
			}
			if (a.get(i) < b.get(j)) {
				resultB++;
			}
		}
		result.add(resultA);
		result.add(resultB);
		return result;
	}

	public static void main(String[] args) throws IOException {
		List<Integer> a = new ArrayList<>();
		List<Integer> b = new ArrayList<>();

		a.add(1);
		a.add(2);
		a.add(3);
		b.add(3);
		b.add(3);
		b.add(1);

		List<Integer> result = compareTriplets(a, b);
		System.out.println(result);
	}
}