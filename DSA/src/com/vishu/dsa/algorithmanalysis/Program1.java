package com.vishu.dsa.algorithmanalysis;

public class Program1 {
	
	public static double findSum(int n) {
		return n*(n+1)/2;
	}
	
	public static double findSum2(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum = sum+i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		long start_time = System.currentTimeMillis();
		
		System.out.println(findSum(10));
		System.out.println(System.currentTimeMillis()-start_time);
		
		System.out.println("-------------------------------------------");
		
		long start_time2 = System.currentTimeMillis();
		System.out.println(findSum2(10));
		System.out.println(System.currentTimeMillis()-start_time);
		
	}

}
