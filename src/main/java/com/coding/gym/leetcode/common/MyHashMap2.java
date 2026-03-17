package com.coding.gym.leetcode.common;

public class MyHashMap2 {
    public class Node {
        int key, value;
        Node next;
        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity = 16; // 初始容量通常設為 2 的冪次
    private int count = 0;     // 追蹤目前有多少個元素
    public int size() {
        return this.count;
    }
    public int getCapacity() {
        return this.capacity;
    }
    private final double LOAD_FACTOR = 0.75;
    private Node[] buckets = new Node[capacity];

    private int getHash(int key, int currentCapacity) {
        return (key & 0x7fffffff) % currentCapacity;
    }

    public void put(int key, int value) {
        // 1. 檢查是否需要擴容
        if ((double) count / capacity >= LOAD_FACTOR) {
            resize();
        }

        int index = getHash(key, capacity);
        Node node = buckets[index];
        while (node != null) {
            if (node.key == key) {
                node.value = value;
                return;
            }
            node = node.next;
        }

        // 2. 插入新節點 (頭插法)
        Node newNode = new Node(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
        count++;
    }

    private void resize() {
        int oldCapacity = capacity;
        capacity = oldCapacity * 2;
        Node[] newBuckets = new Node[capacity];

        for (int i = 0; i < oldCapacity; i++) {
            Node node = buckets[i];

            // 增加這兩個指標，用來在新桶子裡「排隊」
            Node head = null;
            Node tail = null;

            while (node != null) {
                Node nextTemp = node.next; // 暫存下一個，避免斷鏈

                int newIndex = getHash(node.key, capacity);
                // --- 尾插法核心邏輯 ---
                if (tail == null) {
                    head = node;     // 第一個來的，當隊頭
                } else {
                    tail.next = node; // 後來的，接在目前隊尾的後面
                }
                tail = node;         // 更新隊尾指標，指向剛加入的這個人

                node = nextTemp;
            }

            // 當一個舊桶子全部處理完，把整串排好的隊伍掛上新桶子
            if (head != null) {
                tail.next = null;
                newBuckets[getHash(head.key, capacity)] = head;
            }
        }
        this.buckets = newBuckets;
    }

    public int get(int key) {
        int index = getHash(key, capacity);
        Node node = buckets[index];
        while (node != null) {
            if (node.key == key) return node.value;
            node = node.next;
        }
        return -1;
    }

    public void remove(int key) {
        int index = getHash(key, capacity);
        Node dummy = new Node(-1, -1);
        dummy.next = buckets[index];
        Node prev = dummy;
        while (prev.next != null) {
            if (prev.next.key == key) {
                prev.next = prev.next.next;
                buckets[index] = dummy.next;
                count--; // 記得減少計數
                return;
            }
            prev = prev.next;
        }
    }
}