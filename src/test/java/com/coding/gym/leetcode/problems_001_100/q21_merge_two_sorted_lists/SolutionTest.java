package com.coding.gym.leetcode.problems_001_100.q21_merge_two_sorted_lists;

import com.coding.gym.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void testMergeTwoLists() {
        // Case 1: [1,2,4], [1,3,4] -> [1,1,2,3,4,4]
        ListNode l1 = createList(new int[]{1, 2, 4});
        ListNode l2 = createList(new int[]{1, 3, 4});
        ListNode result = solution.mergeTwoLists(l1, l2);

        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4}, listToArray(result));
    }

    @Test
    void testBothEmpty() {
        // Case 2: [], [] -> []
        assertNull(solution.mergeTwoLists(null, null));
    }

    @Test
    void testOneEmpty() {
        // Case 3: [], [0] -> [0]
        ListNode l2 = createList(new int[]{0});
        ListNode result = solution.mergeTwoLists(null, l2);
        assertArrayEquals(new int[]{0}, listToArray(result));
    }

    // --- 輔助方法 ---
    private ListNode createList(int[] vals) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int v : vals) {
            curr.next = new ListNode(v);
            curr = curr.next;
        }
        return dummy.next;
    }

    private int[] listToArray(ListNode head) {
        List<Integer> res = new ArrayList<>();
        while (head != null) {
            res.add(head.val);
            head = head.next;
        }
        return res.stream().mapToInt(i -> i).toArray();
    }
}