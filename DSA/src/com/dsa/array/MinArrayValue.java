package com.dsa.array;

public class MinArrayValue {
	
	public static int findMin(int[] arr) {
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,5,23,6,2,77,3,0};
		System.out.println(findMin(arr));
	}

}
