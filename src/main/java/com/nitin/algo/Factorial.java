/*
 * Given a  number n return its factorial
 * fact(5) = 5 * 4 * 3 * 2 * 1;
 * fact(3) = 3 * 2 * 1
 * fact(0) = 1;
 * 
 */

package com.nitin.algo;

public class Factorial {
	
	public static void main(String[] args) {
		int n = 10;
		System.out.println("The factorial of " + n + " is: " + fact(n));
	}

	private static int fact(int n) {
		if(n <= 1)
			return n;
		int[] fact = new int[n + 1];
		fact[0] = 1;
		fact[1] = 1;
		
		for(int i = 2; i <=n; i++) {
			fact[i] = i * fact[i - 1];
		}
		return fact[n];
	}

}
