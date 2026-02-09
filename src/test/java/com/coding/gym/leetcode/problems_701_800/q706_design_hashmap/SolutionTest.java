package com.coding.gym.leetcode.problems_701_800.q706_design_hashmap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testHashMapBasicOps() {
        Solution.MyHashMap map = new Solution().new MyHashMap();

        map.put(1, 1);
        map.put(2, 2);
        assertEquals(1, map.get(1));
        assertEquals(-1, map.get(3)); // 沒找到

        map.put(2, 1); // 更新 key 為 2 的值
        assertEquals(1, map.get(2));

        map.remove(2);
        assertEquals(-1, map.get(2));

        map.put(2, 1); //測試dummy的寫法
        assertEquals(1, map.get(2));

        map.remove2(2);
        assertEquals(-1, map.get(2));
    }
}