package com.vishu.dsa.Strings;

import java.util.Scanner;

public class Palindrome {
	
	public static void isPalindrome(String str) {
		// convert the string into an array, we can also use charAt()
		// take beg as 0 and end as length -1 
		// increment beg and decrement end and check if first character
		// is equal to the last, while beg<end
		char[] c = str.toCharArray();
		int beg = 0;
		int end = c.length - 1;
		int flag = 1;
		while(beg < end) {
			if(c[beg] != c[end]) {
				flag = 0;
			}
			
			beg++;
			end--;
		}
		if(flag == 1) 
		System.out.println("String is Palindrome");
		else
			System.out.println("String is not palindrome");
	}
	
	public static void main(String[] args) {
		// Given a String str, check whether it is palindrome or not
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		isPalindrome(str);
	}

}
