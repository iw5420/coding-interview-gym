package com.coding.gym.leetcode.problems_201_300.q242_valid_anagram;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void testBasicAnagram() {
        // Case 1: s = "anagram", t = "nagaram" -> true
        String s = "anagram";
        String t = "nagaram";
        assertTrue(solution.isAnagram(s, t), "應該識別為有效的字母異位詞");
    }

    @Test
    void testNotAnagram() {
        // Case 2: s = "rat", t = "car" -> false
        String s = "rat";
        String t = "car";
        assertFalse(solution.isAnagram(s, t), "字母種類不同，不應視為異位詞");
    }

    @Test
    void testDifferentLength() {
        // Case 3: s = "a", t = "ab" -> false
        String s = "a";
        String t = "ab";
        assertFalse(solution.isAnagram(s, t), "長度不同應直接返回 false");
    }

    @Test
    void testEmptyStrings() {
        // Case 4: s = "", t = "" -> true
        String s = "";
        String t = "";
        assertTrue(solution.isAnagram(s, t), "兩個空字串應視為有效的異位詞");
    }

    @Test
    void testSameCharactersDifferentCounts() {
        // Case 5: s = "aacc", t = "ccac" -> false
        String s = "aacc";
        String t = "ccac";
        assertFalse(solution.isAnagram(s, t), "字母出現次數不對稱，不應視為異位詞");
    }

    @Test
    void testLongAnagram() {
        // Case 6: 較長字串驗證效能與正確性
        String s = "dormitory";
        String t = "dirtyroom";
        assertTrue(solution.isAnagram(s, t), "應該識別為較長單字的字母異位詞");
    }
}
