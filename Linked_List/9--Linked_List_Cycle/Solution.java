/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

import java.util.*;
import java.io.*;

public class Solution {
    public boolean hasCycle(ListNode head) {

       
        
       ListNode f = head;
       ListNode s = head;

       while(f != null && f.next != null)
       {
           s = s.next;
           f = f.next.next;
           if(s==f)   return true;
       }
       return false;
       
    }
}