package com.coding.gym.leetcode.problems_701_800.q705_design_hashset;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SoluctionTest {
    @Test
    void testHashSetWithCommonMap() {
        // 實例化內部類別
        Solution.MyHashSet set = new Solution().new MyHashSet();

        // 1. 基礎操作測試
        set.add(1);
        set.add(2);
        assertTrue(set.contains(1));
        assertFalse(set.contains(3));

        // 2. 測試重複加入 (去重邏輯應正常運作)
        set.add(1);
        assertTrue(set.contains(1));

        // 3. 測試刪除 (底層會觸發 common.MyHashMap 的哨兵法斷鏈)
        set.remove(1);
        assertFalse(set.contains(1));
        assertTrue(set.contains(2));

        // 4. 邊界測試：刪除不存在的 key (不應崩潰)
        set.remove(999);
        assertFalse(set.contains(999));
    }
}
