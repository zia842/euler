package com.euler.solutions;

public class P009 {
	
	
	public static void main(String []args) {
		System.out.println(pythagoreanTriplet());
	}
	
	
	public static long pythagoreanTriplet() {
		long product = 1;
		int PERIMETER = 1000;
		
		for(int a=1;a<PERIMETER;a++) {
			
			for(int b=a+1;b<PERIMETER;b++) {
				int c = PERIMETER - a - b;
				if((a*a) + (b*b) == (c*c) ) {
					System.out.println(a);
					System.out.println(b);
					System.out.println(c);
					product = a*b*c;
					break;
				}
			}
		}
		
		return product;
	}

}
