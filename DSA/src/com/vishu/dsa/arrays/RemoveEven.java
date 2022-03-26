package com.vishu.dsa.arrays;

public class RemoveEven {
	
	public static int[] removeEven(int[] arr) {
		int oddCount = 0;
		for(int i : arr) {
			if(i %2 != 0) {
				oddCount++;
			}
		}
		
		int[] result = new int[oddCount-1];
		int idx = 0;
		for(int i=0; i<arr.length; i++) {
			if(i %2 != 0) {
				result[idx] = arr[i];
				idx++;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int[] oddElements = removeEven(arr);
		for(int i : oddElements) {
			System.out.println(i);
		}
	}

}
