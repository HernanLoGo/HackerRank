package com.logo.hackerrank.daysofcode;

public class AAB_Operators {

	static void solve(double meal_cost, int tip_percent, int tax_percent) {

		int result = 0;
		double tip = meal_cost * tip_percent / 100;
		double tax = meal_cost * tax_percent / 100;
		result = (int) Math.round(meal_cost + tip + tax);

		System.out.println(result);

	}

	public static void main(String[] args) {
		solve(12d, 20, 5);
	}
}
