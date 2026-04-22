/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head; //12345

        while (current != null) {
            ListNode next = current.next; // 다음 노드 미리 저장 (끊기기 전에 백업)
            current.next = prev;  // ⭐ 핵심: 현재 노드의 방향을 뒤집어서 이전 노드를 가리키게 함  
            prev = current;  // prev를 현재 노드로 이동 (뒤집힌 리스트의 head 갱신) 
            current = next; // current를 다음 노드로 이동 (원래 리스트 계속 진행)
        }
        return prev;
    }
}
//1234 대입
//1일때
//prev → 1 → null
//current → 2 → 3 → 4 → null
//2일때
//prev → 2 → 1 → null
//current → 3 → 4

// @lc code=end

