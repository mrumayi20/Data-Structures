/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 //Problem URL:: https://leetcode.com/problems/linked-list-cycle-ii/description/
 //explanation is on page 138, problem 13 of DSA book
public class Solution {
    public ListNode detectCycle(ListNode head) {
      if(head == null || head.next == null)
      {
          return null;
      }   
      else
      {
          ListNode slow = head;
          ListNode fast = head;
          while(fast != null && fast.next != null)
          {
              slow = slow.next;
              fast = fast.next.next;
              if(slow == fast)
              {
                  slow = head;
                  while(slow != fast)
                  {
                      slow = slow.next;
                      fast = fast.next;                   
                  }
                  return slow;
              }
          }
      }
      return null;
    }
       
}