package com.dsa.array;

public class PrintArray {
	
	
	public static void printArray(int[] arr) {
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[3] = 10;
		printArray(arr);
	}

}
