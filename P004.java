package com.euler.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P004 {
	
	public static boolean isPalindrome(Integer number) {
		boolean isPalindrome = true;
		String s = number.toString();
		int i = 0;
		int j = s.length() - 1;
		while(i!=j && j>0 && i<s.length()-1) {
			if(s.charAt(i)!=s.charAt(j)) {
				isPalindrome = false;
				break;
			}
			i++;
			j--;
		}
		return isPalindrome;
	}
	
	public static List<Integer> palindromeProduct() {
		int a = 999;
		int b = 999;
		List<Integer> list = new ArrayList<Integer>();
		while(a > 1) {
			while(b > 1) {
				list.add(b*b);
				list.add(b*a);
				b--;
			}
			a--;
			b = 999;
		}
		
		return list;
	}
	
	public static void main(String []args) {
		System.out.println(isPalindrome(Integer.valueOf(200)));
		System.out.println(isPalindrome(Integer.valueOf(10001)));
		List<Integer> list = palindromeProduct();
		Collections.sort(list,Collections.reverseOrder());
		for(Integer i : list) {
			if(isPalindrome(i)) {
				System.out.println(i);
				break;
			}
		}
	}

}
