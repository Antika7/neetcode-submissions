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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode ptr = result;
        int carry = 0;
        int d1=0, d2=0, val=0, num=0;

        while(l1!=null || l2!=null || carry!=0) {

            d1 = (l1!=null) ? l1.val : 0;
            d2 = (l2!=null) ? l2.val : 0;

            val = d1+d2+carry;
            carry = val/10;
            num = val%10;

            ptr.next = new ListNode(num);

            ptr = ptr.next;
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        return result.next;
        
    }
}
