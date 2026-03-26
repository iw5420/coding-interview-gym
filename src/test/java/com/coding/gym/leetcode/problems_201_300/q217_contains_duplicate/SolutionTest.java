package com.coding.gym.leetcode.problems_201_300.q217_contains_duplicate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void testHasDuplicate() {
        // Case 1: [1,2,3,1] -> true
        int[] nums = {1, 2, 3, 1};
        assertTrue(solution.containsDuplicate(nums), "應該偵測到重複元素 1");
    }

    @Test
    void testNoDuplicate() {
        // Case 2: [1,2,3,4] -> false
        int[] nums = {1, 2, 3, 4};
        assertFalse(solution.containsDuplicate(nums), "不應有重複元素");
    }

    @Test
    void testMultipleDuplicates() {
        // Case 3: [1,1,1,3,3,4,3,2,4,2] -> true
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        assertTrue(solution.containsDuplicate(nums), "應該偵測到多組重複元素");
    }

    @Test
    void testEmptyArray() {
        // Case 4: [] -> false
        int[] nums = {};
        assertFalse(solution.containsDuplicate(nums), "空陣列不應視為重複");
    }

    @Test
    void testSingleElement() {
        // Case 5: [1] -> false
        int[] nums = {1};
        assertFalse(solution.containsDuplicate(nums), "單一元素陣列不應視為重複");
    }

    @Test
    void testNegativeNumbers() {
        // Case 6: [-1, -1] -> true (驗證負數處理)
        int[] nums = {-1, -1};
        assertTrue(solution.containsDuplicate(nums), "應該偵測到重複的負數");
    }
}
