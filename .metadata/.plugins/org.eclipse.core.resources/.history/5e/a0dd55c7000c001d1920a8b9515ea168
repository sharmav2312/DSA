package com.vishu.dsa.recursion;

public class PrintNWithoutLoop {
	
	public void printNos(int N)
    {
        //Your code here
        if(N==0)
        return;
        printNos(N-1);
        System.out.print(N+" ");
    }
	
	// using tail recursion
	public void printN(int n, int k) {
		if(n < 1) {
			return;
		}
		System.out.println(k);
		printN(n-1,k++);
	}

}
