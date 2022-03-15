package com.vishu.dsa.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DuplicateElements {
	
	public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> duplicate = new ArrayList<Integer>();
        
        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
        
        for(int i=0; i<n; i++) {
            
            if(m.containsKey(arr[i])) {
                m.put(arr[i],m.get(arr[i])+1);
            }
            else{
                m.put(arr[i],1);
            }
        }
        
        for(Map.Entry es : m.entrySet()) {
            int val = (int) es.getValue();
            
            if(val > 1) {
                duplicate.add((int)es.getKey());
            }
        }
            
        if(duplicate.size() == 0) {
            duplicate.add(-1);
        }
    
        Collections.sort(duplicate);  
           
        return duplicate;
        }


}
