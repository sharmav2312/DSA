package com.vishu.dsa.arrays;

import java.util.Arrays;

public class ReverseArray {
	
	public static String reverseWord(String str)
    {
        // Reverse the string str
        //String rev = "";
        
        StringBuffer s = new StringBuffer(str);
        String rev = new String(s.reverse());
        
        return rev;
        
        // for(int i=str.length()-1; i>=0; i--) {
        //     rev = rev + str.charAt(i);
        // }
        // return rev;
        
        
        
    }
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] sort = Arrays.sort(arr);
	}

}
