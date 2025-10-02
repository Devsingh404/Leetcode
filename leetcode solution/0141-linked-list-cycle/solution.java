/**
 * Definition for singly-linked list.
 * class ListListNode {
 *     int val;
 *     ListListNode next;
 *     ListListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast) return true;
            
        }
        return false;
    }
}
