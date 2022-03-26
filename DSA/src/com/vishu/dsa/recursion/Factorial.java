package com.vishu.dsa.recursion;

public class Factorial {
	
	public static int fact(int n) {
		if(n < 1) {
			return 1;
		}
		return n*fact(n-1);
	}
	
	// tail recursive method
	public static int fact2(int n, int k) {
		
		if(n < 1) {
			return 1;
		}
		return fact2(n-1, n*k);
	}
	
	
	public static void main(String[] args) {
		System.out.println(fact(7));

	}
}
