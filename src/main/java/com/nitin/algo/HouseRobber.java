/*
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, 
 * the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police 
 * if two adjacent houses were broken into on the same night.
 * Given a list of non-negative integers representing the amount of money of each house, 
 * determine the maximum amount of money you can rob tonight without alerting the police.
 * 
 * Input  : hval[] = {6, 7, 1, 3, 8, 2, 4}
 * Output : 19
 * Thief will steal 6, 1, 8 and 4 from house.
 * 
 * Input  : hval[] = {5, 3, 4, 11, 2}
 * Output : 16
 * Thief will steal 5 and 11
 */

package com.nitin.algo;

public class HouseRobber {
	
	public static void main(String[] args) {
		//int[]  hval = {6, 7, 1, 3, 8, 2, 4};
		int[]  hval = {5,3,4,11,2};
		System.out.println("The max amount that can be robbed is: " + maxAmt(hval));
	}

	private static int maxAmt(int[] hval) {
		if(hval == null || hval.length == 0)
			return 0;
		
		int len = hval.length;
		if(len == 1)
			return hval[0];
		
		int[] dp = new int[hval.length];
		dp[0] = hval[0];
		dp[1] = Math.max(hval[0], hval[1]);
		
		for(int i = 2; i < len; i++) {
			dp[i] = Math.max(dp[i-2] + hval[i], dp[i-1]);
		}
		return dp[hval.length - 1];
	}

}
