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
    public int pairSum(ListNode head) {
        if(head.next.next == null){
            return head.val + head.next.val;
        }

        int maxSum = 0;
        ListNode second = head;
        ListNode first = head;
        int i=0; 
        int j=0;
        while(second.next.next != null){
            first = first.next;
            second = second.next.next;
        }

        ListNode rev = reverseList(first.next);

        ListNode h1 = head;
        ListNode h2 = rev;

        while(h1 != null && h2 != null){
            int temp = h1.val + h2.val;
            maxSum = Math.max(temp , maxSum);
            h1 = h1.next; 
            h2 = h2.next; 
        }

        return maxSum;
    }

    public ListNode reverseList(ListNode head) {
        if( head==null || head.next == null ){
            return head;
        }
        ListNode newHead = reverseList(head.next);
        ListNode nxt = head.next;
        nxt.next = head;
        head.next = null;
        return newHead;
    }
}
