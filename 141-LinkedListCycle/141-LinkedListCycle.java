// Last updated: 2/13/2026, 11:23:51 AM
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
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode fast=head;
        ListNode  slow=head;
        while(fast.next!=null&&fast.next.next!=null){    
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow) return true;
        }
        return false;
        }
}