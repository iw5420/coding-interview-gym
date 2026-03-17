package com.coding.gym.leetcode.common;

public class MyHashMap
{
    public class Node {
        int key, value;
        Node next;
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 1000;

    private Node[]buckets = new Node[SIZE];

    private int getHash(int key){
        return (key & 0x7fffffff) % SIZE;
    }
    //如果你看到 0x 後面跟著 2 個字元（如 0xff），那它就是 1 個位元組。
    //如果你看到 0x 後面跟著 8 個字元（如 0x7fffffff），那它就是 4 個位元組。
    //所以這內容是4個位元 7 = 0111, f = 1111

    public void put(int key, int value) {
        int index = getHash(key);
        Node node = buckets[index];
        while(node!=null){
            if(node.key == key){
                node.value = value;
                return;
            }
            node = node.next;
        }
        Node newNode = new Node(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
    }

    public int get(int key) {
        int index = getHash(key);
        Node node = buckets[index];
        while (node != null) {
            if(node.key==key)
                return node.value;
            node = node.next;
        }
        return -1;
    }

    public void remove(int key) {
        int index = getHash(key);
        Node dummy = new Node(-1, -1);
        dummy.next = buckets[index];
        Node prev = dummy;
        while(prev.next!=null){
            if(prev.next.key==key) {
                prev.next = prev.next.next;
                buckets[index] = dummy.next;
                return; //忘記寫return的話,會一直往後直到pre=null時會報錯
            }
            prev = prev.next;
        }
    }
}
