package com.logo.hackerrank.easy;

public class AAC_AVeryBigSum {
	
	static long aVeryBigSum(long[] ar) {

		long result = 0L;
		
		for(long eachAr: ar) {
			result += eachAr;
		}
		
		return result;
    }


    public static void main(String[] args) {
    	
    	long ar [] = {1L,5000L, 15L};
    	long sum = aVeryBigSum(ar);
    	System.out.println(sum);
    }
}
