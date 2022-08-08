package com.vishu.dsa.arrays;

public class RotateArray {
	
	public static void main(String[] args) {
		int[] arr = {1,6,9,7,3};
		int d = 3;
		int n = arr.length;
		
		// rotate from 0 to d-1
		// rotate from d to n-1
		// rotate the whole array 0 to n-1
		
		reverse(arr, 0, d-1);
		reverse(arr, d, n-1);
		reverse(arr, 0, n-1);
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	public static void reverse(int[] arr, int startIndex, int endIndex) {
		
		while(startIndex < endIndex) {
			int temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
			
			startIndex++;
			endIndex--;
		}
		
	}

}
