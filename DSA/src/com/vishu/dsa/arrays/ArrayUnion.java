package com.vishu.dsa.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayUnion {
	
	public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
       ArrayList<Integer> l1 = new ArrayList<>();
       for(Integer i : a) {
           l1.add(i);
       }
       
       ArrayList<Integer> l2 = new ArrayList<>();
        for(Integer i : b) {
           l2.add(i);
       }
        l1.addAll(l2);
        
        Set<Integer> s = new HashSet<>(l1);
        
        return s.size();
    }

}
