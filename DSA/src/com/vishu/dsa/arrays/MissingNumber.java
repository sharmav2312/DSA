package com.vishu.dsa.arrays;

public class MissingNumber {
	
	int MissingNumber(int array[], int n) {
        // Your Code Here
        int sum = n*(n+1)/2;
        int sum2 = 0;
        for(int i=0; i<n-1; i++) {
            sum2 = sum2 + array[i];
        }
        
        return (sum-sum2);
    }

}
