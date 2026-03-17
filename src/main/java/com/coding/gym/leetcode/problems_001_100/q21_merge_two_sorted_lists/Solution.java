package com.coding.gym.leetcode.problems_001_100.q21_merge_two_sorted_lists;

import com.coding.gym.leetcode.common.ListNode;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(list1!=null &&list2!=null){
            if(list1.val<=list2.val){
                tail.next = list1;
                list1 = list1.next;
            }else{
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        tail.next = list1==null?list2:list1;
        return dummy.next;
    }
}
