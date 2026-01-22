package com.coding.gym.leetcode.problems_001_100.q1_two_sum;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode #1: Two Sum
 * * [Overview]
 * Strategy: One-pass Hash Map
 * Time Complexity: O(n)
 * Space Complexity: O(n)

 * [Complexity Analysis - 中文詳細解釋]
 * * Time Complexity: O(n)
 * - 我們僅需遍歷陣列一次 (One-pass)。
 * - 每次在 HashMap 中進行查表 (containsKey) 與插入 (put) 的平均時間皆為 O(1)。
 * - 計算公式：n 個元素 * O(1) 操作 = O(n)。
 * * Space Complexity: O(n)
 * - 在最壞情況下（如答案在最後一組），我們需要將陣列中 n 個元素存入 HashMap 以換取搜尋速度。
 * - 計算公式：額外消耗 O(n) 的記憶體空間。

 * [Complexity Analysis - Detailed English]
 * * Time Complexity: O(n)
 * - The algorithm performs a "One-pass" traversal through the array.
 * - HashMap lookup (containsKey) and insertion (put) operations take O(1) time on average.
 * - Calculation: n elements * O(1) operation = O(n).
 * * Space Complexity: O(n)
 * - In the worst-case scenario, up to n elements are stored in the HashMap to trade memory for speed.
 * - Calculation: O(n) additional space required for the lookup table.
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        // [Key Point] Boundary Check
        if (nums == null || nums.length < 2) {
            return new int[0];
        }

        // [Key Point] Space-Time Tradeoff
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // [Key Point] O(1) Average Lookup
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[0];
    }
}