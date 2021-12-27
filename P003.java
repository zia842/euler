package com.euler.solutions;

import java.util.ArrayList;
import java.util.List;

public class P003 {
	
	public static boolean isPrimeNumber(long n) {
		boolean isPrimeNumber = false;
		for(long i=2;i<=n/2;i++) {
			if(n%i==0) {
				isPrimeNumber = true;
				break;
			}
		}
		return isPrimeNumber;
	}

	
	public static List<Long> getPrimeFactors(Long number){
		List<Long> primeFactorsList = new ArrayList<Long>();
		for(long i=2;i<number;i++) {
			if(number%i == 0) {
				primeFactorsList.add(i);
			}
		}
		return primeFactorsList;
	}
	
	public static List<Long> getPrimeFactorsByDivide(Long number) {
		List<Long> primeFactorsList = new ArrayList<Long>();
		Long n = number;
		Long d = 2L;
		while(n > 1) {
			if(n%d==0) {
				n = n/d;
				primeFactorsList.add(d);
			}
			else {
				d++;
			}
		}
		return primeFactorsList;
	}
	
	public static void main(String args[]) {
		long maxFactor = 1L;
		List<Long> primeFactorsList =  getPrimeFactorsByDivide(600851475143L);
		System.out.println("Max Factor is " + primeFactorsList.get(primeFactorsList.size()-1));
	}
}
