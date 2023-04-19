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

 //Problem URL:: https://leetcode.com/problems/palindrome-linked-list/description/
 class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        //finding the middle elment of the list
        while(fast.next!= null && fast.next.next!= null)
        {
           slow = slow.next;
           fast = fast.next.next;
        }
        //reverse the second half of the list
        fast = head;
        ListNode temp = slow;
        ListNode prev = null;
        while(temp != null)
        {
            ListNode newNode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = newNode;
        }
        //Compare nodes of first list and second reversed lists
        while(prev != null && fast!= null)
        {
            if(prev.val != fast.val)
            {
                return false;
            }
           prev = prev.next;
           fast = fast.next;
        }
        return true;

    }
}