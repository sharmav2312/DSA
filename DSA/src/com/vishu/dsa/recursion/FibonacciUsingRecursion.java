package com.vishu.dsa.recursion;

public class FibonacciUsingRecursion {
	
	static int fibonacci(int n)
    {
        // your code here
        
        if(n == 1 || n == 0) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
	
	public static void main(String[] args) {
		System.out.println(fibonacci(10));
	}

}
