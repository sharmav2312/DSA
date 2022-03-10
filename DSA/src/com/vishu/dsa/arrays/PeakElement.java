package com.vishu.dsa.arrays;

import java.util.Arrays;

public class PeakElement {
	
	public static int peakElement(int[] arr,int n)
    {
       //add code here.
       if(n==1) {
           return 0;
       }
       if(arr[0] >= arr[1]) {
           return 0;
       }
       if(arr[n-1] >= arr[n-2]) {
           return n-1;
       }
       
       for(int i=1; i<n-1; i++) {
           if(arr[i] >= arr[i-1] && arr[i] >= arr[i+1]) {
               return i;
           }
       }
       return 0;
    }
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,9,5,2};
		int peak = peakElement(arr, arr.length);
		System.out.println(peak);
	}

}
