package com.vishu.dsa.recursion;

public class JosephusProblem {
	
	// There are n people in a circle
	// Kth person gets killed 
	// find the survivor
	
	public static int findSurvivor(int n, int k) {
		if(n == 1) return n;
		
		return (findSurvivor(n-1,k) + k-1) % n + 1;
	}
	
	public static void main(String[] args) {
		int sur = findSurvivor(8, 3);
		System.out.println(sur);
	}

}
