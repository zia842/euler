package com.euler.solutions;

public class P005 {
	
	public static void main(String []args) {
		
		int n = 232792560;
		for(int i=1;i<=20;i++) {
			System.out.println(n%i);
		}
		System.out.println("Evenly Divisible ");
		System.out.println(evenlyDivisible());
		
		System.out.println(lcm(12,18));
		System.out.println(lcm(20));
		
	}
	
	public static int evenlyDivisible() {
		int n = 2520;
		while(n > 1) {
			for(int i=1;i<=20;i++) {
				if(n%i!=0) {
					break;
				}
				if(i == 20) {
					return n;
				}
			}
			n++;
		}
		return n;
	}
	
	public static int lcm(int a, int b) {
		return (a*b/gcd(a,b));
	}
	
	/**
	 * Using Euclidean Algorithm
	 * GCD(A,B) = GCD(B,R) R-> is Remainder
	 * If A = 0 then GCD(A,B)=B
	 * If B = 0 then GCD(A,B)=A,
	 * @param a
	 * @param b
	 * @return
	 */
	public static int gcd(int a, int b) {
		if(a == 0) {
			return b;
		}
		return gcd(b%a, a);
	}
	
	
	public static int lcm(int n) {
		int result = 1;
		for(int i=1;i<n;i++) {
			result = (result * i) / gcd(i,result);
		}
		return result;
	}
	

}
