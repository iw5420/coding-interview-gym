package com.coding.gym.leetcode.problems_001_100.q1_two_sum;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("LeetCode #1: Two Sum")
class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Should find indices for target 9 in [2, 7, 11, 15]")
    void testStandardCase() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        assertThat(solution.twoSum(nums, target))
                .containsExactlyInAnyOrder(0, 1)
                .hasSize(2);
    }

    @Test
    @DisplayName("Should return empty array when no pair found")
    void testNoResult() {
        int[] nums = {1, 2, 3};
        int target = 7;
        assertThat(solution.twoSum(nums, target)).isEmpty();
    }

    @Test
    @DisplayName("Should handle negative numbers correctly")
    void testNegativeNumbers() {
        int[] nums = {-3, 4, 3, 90};
        int target = 0;
        assertThat(solution.twoSum(nums, target)).containsExactlyInAnyOrder(0, 2);
    }
}