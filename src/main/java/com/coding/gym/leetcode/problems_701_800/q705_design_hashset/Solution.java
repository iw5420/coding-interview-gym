package com.coding.gym.leetcode.problems_701_800.q705_design_hashset;

import com.coding.gym.leetcode.common.MyHashMap;

public class Solution {
    class MyHashSet {
        private MyHashMap map;
        private final int PRESENT = 0;

        public MyHashSet() {
            map = new MyHashMap();
        }

        public void add(int key){
            map.put(key, PRESENT);
        }

        public void remove(int key){
            map.remove(key);
        }
        public boolean contains(int key){
            return map.get(key) != -1;
        }

    }
}
