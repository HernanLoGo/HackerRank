package com.logo.hackerrank.easy;

public class AAB_SimpleArraySum {

	 /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar) {
        
    	int result = 0;
    	for(int value: ar) {
    		result = result + value;
    	}
    	return result;
    }


    public static void main(String[] args)   {
    	
    	int ar[] = {5,4,7,2,1,4,100};
    	
    	int sum = simpleArraySum(ar);
    	
    	System.out.println(sum);
    }
    
}
