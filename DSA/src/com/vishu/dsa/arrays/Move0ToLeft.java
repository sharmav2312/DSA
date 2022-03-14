package com.vishu.dsa.arrays;

import java.util.ArrayList;

public class Move0ToLeft {
	
	public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        for(int i=0; i<n; i++) {
            if(arr[i] >= 0) {
                pos.add(arr[i]);
            }
            else
                neg.add(arr[i]);
        }
        
        pos.addAll(neg);
        
        for(int i=0; i<n; i++) {
            arr[i] = pos.get(i);
        }
    }

}
