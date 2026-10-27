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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ptr1 = list1;
        ListNode ptr2 = list2;
        ListNode output = new ListNode();
        ListNode result = output;

        while (ptr1 != null && ptr2 != null) {
            if (ptr1.val <= ptr2.val) {
                result.next = ptr1;
                ptr1 = ptr1.next;
            } else {
                result.next = ptr2;
                ptr2 = ptr2.next;
            }
            result = result.next;
        }

        if (ptr1 != null) {
            result.next = ptr1;
        } else {
            result.next = ptr2;
        }

        return output.next;
    }
}