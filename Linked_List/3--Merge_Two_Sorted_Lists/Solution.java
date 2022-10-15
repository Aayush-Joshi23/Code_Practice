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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode hmain = new ListNode();
        ListNode h1 = list1;
        ListNode h2 = list2;
        ListNode head = new ListNode();

        if (h1 == null) {
            return h2;
        } else if (h2 == null) {
            return h1;
        }

        if (h1.val < h2.val) {
            head = h1;
            hmain = h1;
            h1 = h1.next;
        } else {
            head = h2;
            hmain = h2;
            h2 = h2.next;
        }

        while (h1 != null && h2 != null) {
            if (h1.val > h2.val) {
                hmain.next = h2;
                h2 = h2.next;
                hmain = hmain.next;
            } else {
                hmain.next = h1;
                h1 = h1.next;
                hmain = hmain.next;
            }
        }

        if (h1 == null) {
            hmain.next = h2;
        } else {
            hmain.next = h1;
        }
        return head;

    }
}