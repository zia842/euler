package com.euler.solutions;

public class P007 {
	
	public static void main(String []args) throws Exception{
		
		//getPrimeNumber(110999);
		//getPrimeNumber(100);
		//isPrimeNumber(104743);
		int counter = 0;
		int i = 0;
		for(;;i++) {
			if(isPrimeNumber(i)) {
				counter++;
				if(counter == 10001) {
					System.out.println(counter + " Prime Number is " + i);
					break;
				}
			}
		}
	}
	
	public static long getPrimeNumber(int n) {
		long result = 0;
		boolean isPrime[] = new boolean[n+1];
		for(int i=0;i<isPrime.length;i++) {
			isPrime[i] = true;
		}
		isPrime[0] = false;
		isPrime[1] = false;
		
		
		for(int i=2;i*i<=n;i++) {
			if(isPrime[i]) {
				int startMultiple = 2;
				while(i*startMultiple <= n) {
					isPrime[i*startMultiple] = false;
					startMultiple++;
				}
			}
		}
		int counter = 1;
		for(int i=2;i<=n;i++) {
			if(isPrime[i]) {
				System.out.println(counter + " Prime Number is " + i);
				counter++;
			}
		}
		
		return result;
	}
	
	public static boolean isPrimeNumber(int n) throws Exception {
		if(n < 0) {
			throw new Exception("-ve number");
		}
		
		if(n == 0 || n == 1) {
			return false;
		}
		else if(n == 2) {
			return true;
		}
		else {
			
			if(n%2==0) { //Anything Divisible by 2 is Not a Prime
				return false;
			}
			
			for(int i=3, end=(int)Math.sqrt(n);i<=end;i+=2) {
				if(n%i==0) { //Any Number divisible by other than 1 and itself is Not a Prime
					return false;
				}
			}
		}
		return true;
	}

}
