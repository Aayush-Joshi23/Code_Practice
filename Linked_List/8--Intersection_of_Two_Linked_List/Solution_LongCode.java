import JAVA.Linked_List.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution_LongCode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode a = headA;
        ListNode b = headB;
        int ca = 1, cb = 1;

        while (a.next != null || b.next != null) {
            if (a.next != null) {
                ca += 1;
                a = a.next;
            }
            if (b.next != null) {
                cb += 1;
                b = b.next;
            }
        }

        a = headA;
        b = headB;

        if (cb > ca) {
            cb = cb - ca;
            while (cb > 0) {
                b = b.next;
                cb--;
            }
        } else if (cb < ca) {
            ca = ca - cb;
            while (ca > 0) {
                a = a.next;
                ca--;
            }
        }

        while (a != b) {
            a = a.next;
            b = b.next;
        }
        return a;

    }
}