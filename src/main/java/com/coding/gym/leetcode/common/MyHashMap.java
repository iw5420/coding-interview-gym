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
                return;
            }
            prev = prev.next;
        }
    }
}
