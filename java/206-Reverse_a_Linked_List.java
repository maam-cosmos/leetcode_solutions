/**
 * Definition of a single node for singly-linked list.
 *
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *
 *     ListNode (int x){
 *         this.val = x;
 *     }
 * }
 */

public class Solution {
    // Input : 1->2->3->4->5->NULL
    // Output: NULL<-1<-2<-3<-4<-5
    public ListNode reverseList (ListNode head){
        ListNode prev = null;

        while (head != null){
            ListNode next_node = head.next;
            head.next =prev;
            prev = head;
            head = next_node;
        }
        return prev;
    }
}