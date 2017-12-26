/*
 * Find the contiguous sub array within an array (containing at least one number) which has the largest sum and return the max sum.
 * For example, given the array
 * [−2,1,−3,4,−1,2,1,−5,4], the contiguous sub array [4,−1,2,1] has the largest sum = 6.
 */

package com.nitin.algo;

public class MaxSumArray {
	public static void main(String[] args) {
		int[]  arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println("The max sum in the contiguous subArray is: " + maxSumArray(arr));
	}

	private static int maxSumArray(int[] arr) {
		if (arr == null || arr.length == 0)
			throw new IllegalArgumentException("Invalid input");
		
		int[] sum = new int[arr.length];
		int max = arr[0];
		sum[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			sum[i] = Math.max(arr[i], sum[i - 1] + arr[i]);
			max = Math.max(max, sum[i]);
		}
		return max;
	}
}
