package com.logo.hackerrank.easy;

public class AAD_Staircase {

	static void staircase(int n) {
		
		String space = "";
		String simbol = "";
		
		for(int i=0; i<=n; i++) {
			space+=" ";
			simbol+="#";
		}
		
		for(int i=1; i<=n; i++) {
			System.out.println(space.substring(0,n-i) + simbol.substring(0,i));
		}
	}

	public static void main(String[] args) {
		staircase(10);
	}
}
