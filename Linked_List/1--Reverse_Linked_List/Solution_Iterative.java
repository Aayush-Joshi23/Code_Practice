import JAVA.Linked_List.ListNode;

// Definition for singly-linked list.

class Solution {
    public ListNode reverseList(ListNode head) {

        if (head == null) {
            return head;
        } else if (head.next == null) {
            return head;
        } else if (head.next.next == null) {
            ListNode n = head.next;
            n.next = head;
            head.next = null;
            return n;
        } else {

            ListNode n = head.next;
            ListNode ntn = n.next;
            head.next = null;

            while (n.next != null) {
                ntn = n.next;
                n.next = head;
                head = n;
                n = ntn;
            }
            n.next = head;

            return n;

        }

    }
}