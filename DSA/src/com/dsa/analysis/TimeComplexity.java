package com.dsa.analysis;

public class TimeComplexity {
	
	public static void main(String[] args) {
		double startTime = System.currentTimeMillis();
		
		System.out.println(findSum(20));
//		System.out.println(findSum2(20));
		
		System.out.println("Total time taken: " + (System.currentTimeMillis() - startTime) );
	}
	
	public static int findSum(int n) {
		
		return n * (n+1) / 2;
	}
	
	public static int findSum2(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum = sum + i;
		}
		return sum;
	}

}
