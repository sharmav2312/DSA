package com.vishu.dsa.arrays;

public class SortArray {
	
	public static void main(String[] args) {
		int[] arr = {1,4,6,20,8,9,4}; 
		int n = arr.length;
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=i; j < n-i; j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                 }
                for(int e : arr) {
                	System.out.println(e);
                }
         }  
	}

}
