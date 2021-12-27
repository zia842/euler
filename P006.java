package com.euler.solutions;

/**
 * 
 * @author ziaalkhair.mohammed
 *
 */

public class P006 {
	
	public static void main(String []args) {
		System.out.println(diffBwSumOfSqAndSqOfSum(100));
	}
	
	public static int diffBwSumOfSqAndSqOfSum(int n) {
		int result = 0;
		int sumOfSquares = (n*(n+1)*(2*n+1))/6;
		int squareOfSum = (n*(n+1))/2;
		result = (squareOfSum * squareOfSum) - sumOfSquares;
		return result;
	}

}
