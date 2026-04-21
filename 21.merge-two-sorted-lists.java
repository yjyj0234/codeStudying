/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode outputList = new ListNode();
        ListNode current = outputList;
        while (list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
                current = current.next;
                
            }else {
                current.next = list2;
                list2 = list2.next;
                current = current.next;
            }
        }
        //남아있는 리스트 전체를한번에 뒤에 붙임
        current.next = (list1 != null) ? list1 : list2;
        return outputList.next;
    }
}
// @lc code=end

