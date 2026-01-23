package com.coding.gym.leetcode.problems_701_800.q706_design_hashmap;

public class Solution {
    // LeetCode 要求的類別名稱
    class MyHashMap {
        private class Node {
            int key, value;
            Node next;
            Node(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        private final int SIZE = 1000;
        private Node[] buckets;

        public MyHashMap() {
            buckets = new Node[SIZE];
        }

        public void put(int key, int value) {
            // 待實作
        }

        public int get(int key) {
            // 待實作
            return -1;
        }

        public void remove(int key) {
            // 待實作
        }

        private int getHash(int key) {
            return Math.abs(key) % SIZE;
        }
    }
}
