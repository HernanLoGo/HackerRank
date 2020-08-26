package com.logo.hackerrank.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AAD_DiagonalDifference {

	public static int diagonalDifference(List<List<Integer>> arr) {
		int result = 0;
		int primaryDiagonal = 0;
		int secundaryDiagonal = 0;

		for (int i = 0, j = arr.size() - 1; i < arr.size(); i++, j--) {
			primaryDiagonal += arr.get(i).get(i);
			secundaryDiagonal += arr.get(i).get(j);
		}

		result = Math.abs(primaryDiagonal - secundaryDiagonal);

		return result;

	}

	public static void main(String[] args) {
		List<List<Integer>> arr = new ArrayList<>();
		arr.add(Arrays.asList(1, 2, 3));
		arr.add(Arrays.asList(4, 5, 6));
		arr.add(Arrays.asList(9, 8, 9));

		int result = diagonalDifference(arr);

		System.out.println(result);

	}

}
