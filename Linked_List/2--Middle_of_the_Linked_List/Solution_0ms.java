import JAVA.Linked_List.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode middleNode(ListNode head) {

        ListNode n = head;
        int c = 1;

        while (n.next != null) {
            c++;
            n = n.next;
        }

        int a = 0;
        c = c / 2;
        n = head;

        while (a < c) {
            a++;
            n = n.next;
        }
        return n;

    }
}
