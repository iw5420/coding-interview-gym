package com.coding.gym.leetcode.problems_101_200;

public class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length<2)return 0;

        int n = prices.length;
        int maxProfit = 0;
        int minPrice = prices[0];
        for(int i = 1; i<n; i++){
            minPrice = Math.min(minPrice,prices[i]);
            maxProfit = Math.max(maxProfit, prices[i]-minPrice);
        }

        return maxProfit;
    }

}
