package com.esethuraman.liquibase.demo.Leet;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount+1];
        dp[0] = 0;

        for(int i=1; i<dp.length; i++) {
            dp[i] = Integer.MAX_VALUE-1;
        }

        for(int coin : coins) {
            for(int j=coin; j<=amount; j++) {
                if(!(coin > amount)){
                    dp[j] = Math.min(dp[j], 1+dp[j-coin]);
                }
            }
        }

        return (dp[amount]==Integer.MAX_VALUE)? -1 : dp[amount];
    }

    public static void main(String[] args) {
        CoinChange obj = new CoinChange();
        obj.coinChange(new int[]{2}, 3);
    }
}
