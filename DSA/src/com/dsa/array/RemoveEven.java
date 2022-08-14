package com.dsa.array;

public class RemoveEven {
	
	public static int[] removeEven(int[] arr) {
		int oddCount = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] %2 != 0) {
				oddCount++;
			}
		}
		
		int[] oddArray = new int[oddCount];
		int j = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] %2 != 0) {
				oddArray[j] = arr[i];
				j++;
			}
		}
		return oddArray;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,3,6,2,6,8,9};
		
		int[] odd = removeEven(arr);
		
		for(int i : odd) {
			System.out.print(i+" ");
		}
	}

}
