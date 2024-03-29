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
class Solution 
{
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) 
      {

        ListNode la = null, lb = null, head = list1, prev = null;
        int ac = 0, bc = 0;

        while(list1!=null && ac<a-1)
        {
            list1 = list1.next;
            ac++;
        }

        bc = ac;
        la = list1;

        while(list1!=null && bc<b)
        {
            list1 = list1.next;
            bc++;
        }

        la.next = list2;
        while(list2.next != null)
            list2 = list2.next;
        
        list2.next = list1.next;
	
	return head;
	
      }
}