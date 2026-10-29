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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode tmp = head;
        int l=0; //to store length of linkedlist
        int ctr=0;

        while(tmp!=null) {
            l++;
            tmp=tmp.next;
        }

        System.out.println("Length of LinkedList = "+ l);

        if (n == l) {
            return head.next;
        }

        tmp = head;
        n = l-n; //removing the nth node from the end is equivalent to removing the (l - n)th node from the front

        while(ctr<n-1) {
            System.out.println(tmp.val);
            tmp = tmp.next;
            ctr++;
        }

        tmp.next = tmp.next.next;

        return head;

    }
}
