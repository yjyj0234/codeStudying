/*
 * @lc app=leetcode id=160 lang=java
 *
 * [160] Intersection of Two Linked Lists
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lnA = 0;
        int lnB = 0;

        ListNode a = headA;
        ListNode b = headB;

        ListNode aa = headA;
        ListNode bb = headB;

        while (a != null) {
            lnA++;
            a = a.next;
        }
        while (b != null) {
            lnB++;
            b = b.next;
        }
        if(lnA > lnB) {
            int diff = Math.abs(lnA-lnB);
            while (diff != 0) {
                diff --;
                aa=aa.next;
            }
        }else {
            int diff = Math.abs(lnB-lnA);
            while (diff != 0) {
                diff --;
                bb=bb.next;
            }
        }

        while (aa != bb) {
            aa = aa.next;
            bb = bb.next;
        }
        return bb;
        
    }
}
// @lc code=end

