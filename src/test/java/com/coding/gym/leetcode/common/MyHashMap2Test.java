package com.coding.gym.leetcode.common;

public class MyHashMap2Test {
    public static void main(String[] args) {
        MyHashMap2 map = new MyHashMap2();

        System.out.println("=== 測試 1: 基本存取與覆蓋 ===");
        map.put(1, 100);
        map.put(1, 200); // 測試相同 Key 覆蓋
        System.out.println("Key 1 的值 (預期 200): " + map.get(1));

        System.out.println("\n=== 測試 2: 觸發 Resize 觀察 ===");
        System.out.println("初始 Capacity: " + map.getCapacity());

        // 初始容量 16, Load Factor 0.75 -> 臨界值是 12
        // 我們存入 12 個元素
        for (int i = 2; i <= 12; i++) {
            map.put(i, i * 10);
        }
        System.out.println("存入 12 個元素後的 Capacity: " + map.getCapacity());
        System.out.println("目前元素總數: " + map.size());

        // 存入第 13 個元素，應該觸發 Resize
        map.put(13, 130);
        System.out.println("存入第 13 個元素後的 Capacity (預期 32): " + map.getCapacity());

        System.out.println("\n=== 測試 3: Resize 後資料完整性 ===");
        boolean allCorrect = true;
        for (int i = 1; i <= 13; i++) {
            int expected = (i == 1) ? 200 : i * 10;
            if (map.get(i) != expected) {
                System.out.println("錯誤！Key " + i + " 的值不正確: " + map.get(i));
                allCorrect = false;
            }
        }
        if (allCorrect) {
            System.out.println("恭喜！Resize 後所有資料重新 Hash 並正確移動。");
        }

        System.out.println("\n=== 測試 4: 刪除功能 ===");
        map.remove(5);
        System.out.println("刪除 Key 5 後的 get(5) (預期 -1): " + map.get(5));
        System.out.println("目前元素總數 (預期 12): " + map.size());
    }
}
