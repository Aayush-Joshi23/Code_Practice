import JAVA.Linked_List.ListNode;

class Solution {
    public boolean isPalindrome(ListNode head) {

        if (head == null)
            return false;
        else if (head.next == null)
            return true;
        else if (head.next.next == null) {
            boolean bool = (head.val == head.next.val) ? true : false;
            return bool;
        }
        ListNode mid = middle(head);
        ListNode last = reverse(mid);
        ListNode cur = head;
        while (last != null) {
            if (last.val != cur.val)
                return false;
            last = last.next;
            cur = cur.next;
        }
        return true;
    }

    public static ListNode middle(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ;
        ListNode h = head;
        ListNode p = null;
        ListNode c = h;
        ListNode n = h;
        while (n != null) {
            n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        head.next = null;
        n = p;
        return n;
    }
}