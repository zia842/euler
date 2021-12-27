package com.euler.solutions;

import java.math.BigInteger;

public class P012 {
	
	public static void main(String []args) {
		
		int triangle = 0;
		for(int i=1;;i++) {
			if(Integer.MAX_VALUE - triangle < i)
				throw new ArithmeticException("Overflow");
			triangle += i; 
			//System.out.print(triangle + " ");
			if(countDivisors(triangle) > 500) {
				System.out.println(triangle);
				break;
			}
				
		}
		
		System.out.println(run());
	}
	
	public static int countDivisors(int n) {
		int count = 0;
		int end = (int)Math.sqrt(n);
		for(int i=1;i<end;i++) {
			if(n%i == 0) {
				count+= 2;
			}
		}
		if(end * end == n) {
			count++;
		}
		
		return count;
	}
	
	public static String run() {
		BigInteger sum = BigInteger.ZERO;
		for (String num : NUMBERS)
			sum = sum.add(new BigInteger(num));
		return sum.toString().substring(0, 10);
	}
	
	private static String[] NUMBERS = {"37107287533902102798797998220837590246510135740250",
			"46376937677490009712648124896970078050417018260538"};

}
