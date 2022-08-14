package com.dsa.array;

public class ZeroesToEnd {
	
	public static int[] moveZeroesToEnd(int[] arr) {
		int j = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != 0 && arr[j] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if(arr[j] != 0) {
				j++;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,5,2,6,0,0,23,1,5,6};
		int[] newArr = moveZeroesToEnd(arr);
		for(int i : newArr) {
			System.out.print(i+" ");
		}
	}

}
