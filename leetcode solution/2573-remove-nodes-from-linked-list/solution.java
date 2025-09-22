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
    public int max = Integer.MIN_VALUE;
    public ListNode removeNodes(ListNode head) {
        if(head == null) return head;

        if(head.next == null) return head;
        else{
            ListNode nextNode = removeNodes(head.next);
            max = Math.max(max,nextNode.val);
            if(head.val < max){
                head.val = nextNode.val;
                head.next = head.next.next;
            }
        } 
        return head;
    }


}
