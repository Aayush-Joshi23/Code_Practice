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
public class Solution_BruteForce {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }

        ListNode a = headA;
        ListNode b = headB;

        while (a != null) {
            b = headB;
            while (b != null) {
                if (a == b && a != null)
                    return a;
                b = b.next;
            }
            a = a.next;
        }

        return null;
    }
}