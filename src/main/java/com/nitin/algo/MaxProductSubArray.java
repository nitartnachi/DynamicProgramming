/*
 * Find the contiguous subarray within an array (containing at least one number) which has the largest product.
 * For example, given the array [2,3,-2,4], the contiguous subarray [2,3] has the largest product = 6.
 */

package com.nitin.algo;

public class MaxProductSubArray {

	public static void main(String[] args) {
		int[]  arr = {2,3,-2,4};
		System.out.println("The max sum in the contiguous subArray is: " + maxProdSubArray(arr));
	}

	private static int maxProdSubArray(int[] nums) {
		if (nums == null || nums.length == 0)
			throw new IllegalArgumentException("Invalid input");
		
		int[] max = new int[nums.length];
	    int[] min = new int[nums.length];
	 
	    max[0] = min[0] = nums[0];
	    int result = nums[0];
	 
	    for(int i = 1; i < nums.length; i++){
	        if(nums[i] > 0){
	            max[i] = Math.max(nums[i], max[i - 1] * nums[i]);
	            min[i] = Math.min(nums[i], min[i - 1] * nums[i]);
	        }else{
	            max[i] = Math.max(nums[i], min[i - 1]*nums[i]);
	            min[i] = Math.min(nums[i], max[i - 1]*nums[i]);
	        }
	 
	        result = Math.max(result, max[i]);
	    }
	 
	    return result;
	}
}
