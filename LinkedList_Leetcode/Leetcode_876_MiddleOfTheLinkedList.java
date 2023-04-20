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
//Problem URL:: https://leetcode.com/problems/middle-of-the-linked-list/description/

class Solution {
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
        }
        else
        {
            //using 2 pointer approach
            ListNode slow = head;
            ListNode fast = head;
            while(fast.next != null && fast.next.next != null)
            {
                slow = slow.next;
                fast = fast.next.next;
            }

            if(fast.next == null)
            {
                return slow;
            }
            else
            {
                return slow.next;
            }
        }
    }
}