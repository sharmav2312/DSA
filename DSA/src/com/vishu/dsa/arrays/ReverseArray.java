package com.vishu.dsa.arrays;

public class ReverseArray {
	
	public static void main(String[] args) {
		// given 
		int[] arr = {1,2,3,10,4};
		
		// Approach
		// Two pointer approach
		
		int low = 0;
		int high = arr.length - 1;
		
		while(low < high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			
			low++;
			high--;
		}
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}

}
