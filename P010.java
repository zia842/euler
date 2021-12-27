package com.euler.solutions;

public class P010 {

	public static boolean isPrimeNumber(int n) throws Exception {
		if (n < 0) {
			throw new Exception("-ve number");
		}

		if (n == 0 || n == 1) {
			return false;
		} else if (n == 2) {
			return true;
		} else {

			if (n % 2 == 0) { // Anything Divisible by 2 is Not a Prime
				return false;
			}

			for (int i = 3, end = (int) Math.sqrt(n); i <= end; i += 2) {
				if (n % i == 0) { // Any Number divisible by other than 1 and itself is Not a Prime
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) throws Exception {
		long sum = 0;
		for (int i = 0; i < 2000000; i++) {
			if (isPrimeNumber(i)) {
				sum += i;
			}
		}
		System.out.println(sum);

	}

}
