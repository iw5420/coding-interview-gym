package com.coding.gym.leetcode.problems_101_200.q121_best_time_to_buy_and_sell_stock;

import com.coding.gym.leetcode.problems_101_200.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void testMaxProfit_NormalCase() {
        // Case 1: [7,1,5,3,6,4] -> 買入 1, 賣出 6, 利潤 5
        int[] prices = {7, 1, 5, 3, 6, 4};
        assertEquals(5, solution.maxProfit(prices));
    }

    @Test
    void testMaxProfit_DownwardTrend() {
        // Case 2: [7,6,4,3,1] -> 一路下跌，利潤 0
        int[] prices = {7, 6, 4, 3, 1};
        assertEquals(0, solution.maxProfit(prices));
    }

    @Test
    void testMaxProfit_EdgeCase_Empty() {
        // Case 3: 空陣列 -> 利潤 0
        int[] prices = {};
        assertEquals(0, solution.maxProfit(prices));
    }

    @Test
    void testMaxProfit_EdgeCase_Null() {
        // Case 4: null 輸入 -> 利潤 0
        assertEquals(0, solution.maxProfit(null));
    }

    @Test
    void testMaxProfit_EdgeCase_SingleDay() {
        // Case 5: 只有一天 -> 無法交易，利潤 0
        int[] prices = {5};
        assertEquals(0, solution.maxProfit(prices));
    }

    @Test
    void testMaxProfit_SmallBounce() {
        // Case 6: [2, 4, 1] -> 雖然最後有 1 但太晚了，最大利潤發生在 2 買 4 賣
        int[] prices = {2, 4, 1};
        assertEquals(2, solution.maxProfit(prices));
    }
}
