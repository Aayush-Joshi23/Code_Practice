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
    public ListNode swapPairs(ListNode head) {

        if(head==null || head.next == null)
            return head;

        ListNode n = head.next, h = head;
        int temp=0;
        
        while(n.next!= null)
        {

            temp = head.val;
            head.val = n.val;
            n.val = temp;
            head = n.next;
            
	    if(head.next!=null)
                n = head.next;
            else
            {
                n=null;
                break;
            }

        }

        if(n!=null)
        {
            temp = head.val;
            head.val = n.val;
            n.val = temp;
        }
        
        return h;
        
    }
}