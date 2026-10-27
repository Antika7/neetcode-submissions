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

        if (head == null || head.next == null) {
            return head;
        }

        ListNode curr = head;
        ListNode curr1 = head.next;
        ListNode curr2;

        head.next = null;

        while(curr1.next!=null) {
            curr2 = curr1.next;
            curr1.next=curr;

            curr = curr1;
            curr1 = curr2;
        }
        
        curr1.next = curr;
        
        return curr1;
    }
}
