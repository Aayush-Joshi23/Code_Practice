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
	while(list1!=null)
        {

            if(ac == a)
            {
                la = prev;
                ac = a+2;
            }

            if(ac>a && bc==b)
            {
                lb = list1.next != null ? list1.next : null;
                bc = b+2;
            }
            else if(ac>a && bc>b)
            {
                la.next = list2;
                while(list2.next != null)
                    list2 = list2.next;
                list2.next = lb;
                break;
            }

            ac++;
            bc++;
            prev = list1;
            list1 = list1.next != null ? list1.next : null;
        }

        return head;
        
    }
}