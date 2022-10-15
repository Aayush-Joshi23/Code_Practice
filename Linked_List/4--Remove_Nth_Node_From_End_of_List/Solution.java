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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) {
            return head;
        }

        if (head.next == null && n == 1) {
            return null;
        }

        int c = 1;
        ListNode hmain = head;

        while (hmain.next != null) {
            c += 1;
            hmain = hmain.next;
        }

        if (c == n) {
            return head.next;
        }

        int cc = c - n;
        if (c == cc) {
            hmain.next = null;
        }

        hmain = head;

        for (int i = 1; i < cc; i++) {
            hmain = hmain.next;
        }

        hmain.next = hmain.next.next;

        hmain = null;
        return head;

    }
}