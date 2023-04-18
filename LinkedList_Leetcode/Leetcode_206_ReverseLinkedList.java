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

 //Problem URL:: https://leetcode.com/problems/reverse-linked-list/description/
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        if(head == null)
        return head;
        else
        {
            while(curr != null)
            {
                ListNode fw = curr.next;
                curr.next = prev;
                prev = curr;
                curr = fw;
            }
            return prev;       
        }
    }
}