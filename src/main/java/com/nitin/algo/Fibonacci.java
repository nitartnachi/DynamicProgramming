/*
 * Given a  number n return the nth numbers in fibonacci sequence
 * 0,1,1,2,3,5,8,13,21,34,55.....
 * n = 0 return 0
 * n = 1 return 1
 * n = 2 return 2;
 * n = 8 return 21
 * 
 */

package com.nitin.algo;

public class Fibonacci {
	
	public static void main(String[] args) {
		int n = 10;
		System.out.println("The " + n + "th number in fibonacci sequence is: " + fib(n));
	}

	private static int fib(int n) {
		if(n <= 1)
			return n;
		
		int[] fib = new int[n+1];
		fib[0] = 0;
		fib[1] = 1;
		for(int i = 2; i <= n; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		return fib[n];
	}

}
