package com.vishu.dsa.recursion;

public class PalindromeString {
	
	// start = 0, end = str.length()-1
	public boolean isPalindrome(String str, int start, int end) {
		
		// base case
		if(start == end) {
			return true;
		}
		if(start > end) {
			return true;
		}
		
		if(str.charAt(start) != str.charAt(end))
			return false;
		return isPalindrome(str, start+1, end-1);
		
		
	}

}
