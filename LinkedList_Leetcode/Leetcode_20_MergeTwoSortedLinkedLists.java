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

 //Problem URL:: https://leetcode.com/problems/merge-two-sorted-lists/description/
class Solution {
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
         ListNode head = new ListNode(0);
         ListNode dummy = head;
        
           while(l1 != null && l2 != null)
           {
               if(l1.val <= l2.val)
               {
                   dummy.next = l1;                  
                   l1 = l1.next;
               }
               else
               {
                   dummy.next = l2;
                   l2 = l2.next;
               }
               dummy = dummy.next;
           }
           if(l1==null)
           {
               dummy.next = l2;
               
           }
           
           if(l2==null)
           {
               dummy.next = l1;
               
           }
           return head.next;
        
        
    }
}