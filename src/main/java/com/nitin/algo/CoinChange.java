/*
 * You are given coins of different denominations and a total amount of money amount. 
 * Write a function to compute the fewest number of coins that you need to make up that amount. 
 * If that amount of money cannot be made up by any combination of the coins, return -1.
 */

package com.nitin.algo;

public class CoinChange {
	
	public static void main(String[] args) {
		int[] coins = {25, 10, 5, 1};
		int value = 36;
		System.out.println("The minimum number of coins needed to accumulate the value is: " + coinChange(coins, value));
	}

	private static int coinChange(int[] coins, int value) {
		if(value == 0) return 0;
		 
	    int[] dp = new int [value + 1];
	    dp[0] = 0; // do not need any coin to get 0 amount
	    for(int i = 1;i <= value; i++)
	        dp[i]= Integer.MAX_VALUE;
	    
	    for(int i = 0; i <= value; i++){
	        for(int coin: coins){
	            if(i + coin <= value){
	                if(dp[i] == Integer.MAX_VALUE){
	                    dp[i + coin] = dp[i + coin];
	                }else{
	                    dp[i + coin] = Math.min(dp[i + coin], dp[i] + 1);
	                }
	            }
	        }
	    }
	 
	    if(dp[value] >= Integer.MAX_VALUE)
	        return -1;
	 
	    return dp[value];
	}

}
