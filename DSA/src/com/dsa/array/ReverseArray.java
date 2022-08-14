package com.dsa.array;

public class ReverseArray {
	
	public static int[] reverseArray(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,5,2,6,2,6};
		int[] rev = reverseArray(arr);
		for(int i : rev) {
			System.out.print(i+" ");
		}
	}

}
