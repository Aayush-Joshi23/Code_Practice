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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int c = 0, s = 0;
        ListNode h1 = l1;
        ListNode h2 = l2;

        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }

        s = h1.val + h2.val + c;
        c = s / 10;
        ListNode head = new ListNode((s % 10), null);

        ListNode hh = head;
        h1 = h1.next;
        h2 = h2.next;
        s = 0;

        while (h1 != null || h2 != null) {
            if (h1 == null && c == 0) {
                hh.next = h2;
                break;
            }

            if (h2 == null && c == 0) {
                hh.next = h1;
                break;
            }
            if (h1 != null) {
                s += h1.val;
                h1 = h1.next;
            }

            if (h2 != null) {
                s += h2.val;
                h2 = h2.next;
            }

            s += c;
            c = s / 10;
            hh.next = new ListNode((s % 10), null);
            hh = hh.next;
            s = 0;
        }

        if (c != 0) {
            hh.next = new ListNode(1, null);
        }

        hh = null;
        h1 = null;
        h2 = null;

        return head;

    }
}

public class Solution_2ms {

}
