import JAVA.Linked_List.ListNode;



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
    public boolean isPalindrome(ListNode head) {

        if(head.next == null || head == null)
        {
            return true;
        }

        ListNode h = head;

        ArrayList<Integer> arr  = new ArrayList<>();
        while(h!=null)
        {
            arr.add(h.val);
            h = h.next;
        }
        int n = arr.size()-1;
        for(int i=0; i<= n/2 ;i++)
        {
            if( arr.get(i) != arr.get(n-i)  )
            {
                return false;
            }
        }
        return true;



    }

    
}