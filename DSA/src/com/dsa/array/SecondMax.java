package com.dsa.array;

public class SecondMax {
	
	public static int secondMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				secondMax = max;
				max = arr[i];
			}
			else if(arr[i] > secondMax && arr[i] != 0) {
				secondMax = arr[i];
			}
		}
		return secondMax;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,4,6,3,2,6,7};
		System.out.println(secondMax(arr));
	}

}
