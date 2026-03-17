package com.coding.gym.leetcode.problems_701_800.q706_design_hashmap;

public class Solution {
    // LeetCode 要求的類別名稱
    class MyHashMap {
        public class Node {
            int key, value;
            Node next;
            Node(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        private final int SIZE = 1000;

        private final Node[]buckets = new Node[SIZE];

        private int getHash(int key){
            return (key & 0x7fffffff) % SIZE;
        }

        public void put(int key, int value) {
            // 1標記位置
            int index = getHash(key);
            Node node = buckets[index];
            // 2檢查
            while(node!=null){
                if (node.key == key) {
                    node.value = value;
                    return;
                }
                node = node.next;
            }
            // 3新增
            Node newNode = new Node(key, value);
            newNode.next = buckets[index];
            buckets[index]=newNode;
        }

        public int get(int key) {
            int index = getHash(key);
            Node node = buckets[index];
            // 2檢查
            while(node!=null){
                if (node.key == key) {
                    return node.value;
                }
                node = node.next;
            }
            return -1;
        }

        public void remove(int key) {
            // 1初始
            int index = getHash(key);
            Node current = buckets[index];
            Node prevNode = null;

            // 2迴圈 執行邏輯
            while(current!=null){
                if (current.key == key) {
                    //如果是第一個
                    if(prevNode == null) {
                        buckets[index] = current.next;
                    }else{
                        prevNode.next = current.next;
                    }
                    return; //如果已經找到就不用繼續跑迴圈
                }
                prevNode = current;
                current = current.next;
            }
        }

        public void remove2(int key){
            int index = getHash(key);
            if(buckets[index]==null)return;
            Node dummy = new Node(-1, -1);
            dummy.next = buckets[index];
            Node prev = dummy;
            while(prev.next!=null){
                if(prev.next.key==key){
                    prev.next = prev.next.next;
                    buckets[index] = dummy.next;
                    return;
                }
                prev = prev.next;
            }
        }
    }
}
