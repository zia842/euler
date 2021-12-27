package com.euler.solutions;

public class CalculateLog {
	
	
	public static int calculateLog(int base, int n) {
		int result = 1;
		
		if(base > n) {
			return 0;
		}
		int i = 1;
		for(i=0;result < n; i++) {
			result = (result * base);
		}
		return i;
	}
	
	/**
	 * Keep dividing the number / base as long as it is > 1 and increment counter when result is 1 
	 * @param base
	 * @param n
	 * @return
	 */
	
	public static int calcLog(int base, int n) {
		int result = 1;
		if(base > n) {
			return 0;
		}
		
		int ctr = 0;
		result = n;
		while(result > 1) {
			result = result / base;
			ctr++;
		}
		
		return ctr;
	}
	
	public static void main(String []args) {
		System.out.println(calculateLog(3, 9) == calcLog(3, 9));
		System.out.println(calculateLog(3, 27) == calcLog(3, 27));
		System.out.println(calculateLog(3, 81) == calcLog(3, 81));
		
		System.out.println(calculateLog(2, 2) == calcLog(2, 2));
		System.out.println(calculateLog(2, 4) == calcLog(2, 4));
		System.out.println(calculateLog(2, 8) == calcLog(2, 8));
		System.out.println(calculateLog(2, 16) == calcLog(2, 16));
		
		System.out.println(calculateLog(10, 100) == calcLog(10, 100));
		System.out.println(calculateLog(10, 1000) == calcLog(10, 1000));
		
		System.out.println(calculateLog(2, 256) == calcLog(2, 256));
		
	}

}
