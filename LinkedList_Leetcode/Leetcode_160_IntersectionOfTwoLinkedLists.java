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

 /*Approach:: Find size of both lists, move the head pointer of the longest list till the difference(1st while loop), then travel both lists simultaneously and return the node whole headA == headB
 DSA bool , page 141, problem no 18 */
//Problem URL :: https://leetcode.com/problems/intersection-of-two-linked-lists/description/
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA = Size(headA);
        int sizeB = Size(headB);
        int index = 0;
        
        
            index = Math.abs(sizeA-sizeB);
           
            if (index == 0 && headA != null && headB != null && headA == headB) {
                     return headA;
              }
            int i = 0;
            while(index > i && index!=0)
            {
                if(sizeA>sizeB)
                {
                    headA = headA.next;
                }
                else
                {
                    headB = headB.next;
                }
               i++;
            }

            while(headA != null && headB!= null &&
            headA!=headB)
            {
                headA = headA.next;
                headB = headB.next;
            }

            return headA;  
        
    }

    int Size(ListNode head)
    { int count = 0;
        if(head == null)
        return count;
        else
        {
            while(head != null)
            {
                count++;
                head = head.next;
            }
        }
        return count;
    }
}